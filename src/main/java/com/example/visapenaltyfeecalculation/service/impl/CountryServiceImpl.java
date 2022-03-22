package com.example.visapenaltyfeecalculation.service.impl;

import com.example.visapenaltyfeecalculation.dto.CountriesDto;
import com.example.visapenaltyfeecalculation.service.CountryService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private static final List<CountriesDto> list = CountriesDto.countriesList();
    private static final BigDecimal turkishLira = BigDecimal.valueOf(14.8389);

    @Override
    public List<String> getAll() {
        List<String> countryList = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            countryList.add(list.get(i).getCountry());
        }
        return countryList;
    }

    @Override
    public BigDecimal calculator(Integer id, String entryDate, String visaValidityDate, String residencePermit) throws ParseException {

        CountriesDto country = list.get(id - 1);

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        LocalDate entryLocalDate = dateFormat.parse(entryDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long differentDateOfDays;
        if (visaValidityDate.equals("00.00.0000")) {
            LocalDate currentDate = Instant.now().atZone(ZoneId.systemDefault()).toLocalDate();
            differentDateOfDays = entryLocalDate.until(currentDate, ChronoUnit.DAYS);

        } else {
            LocalDate validityLocalDate = dateFormat.parse(visaValidityDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            differentDateOfDays = entryLocalDate.until(validityLocalDate, ChronoUnit.DAYS);
        }

        BigDecimal visaFee = null;
        BigDecimal cardFee = BigDecimal.valueOf(160.00);
        if (residencePermit.equals("Evet")) {
            visaFee = BigDecimal.valueOf(0.00);
        } else {
            visaFee = BigDecimal.valueOf(1033.60);
        }

        long numberOfAdditionalDays = differentDateOfDays - (country.getVisaDuration() * 30L); // 350 - 90 = 260

        BigDecimal totalPenaltyAmount = null;
        if (numberOfAdditionalDays >= 30){
            numberOfAdditionalDays -= 30; // 230
            if (numberOfAdditionalDays >= 30) {
                BigDecimal additionalDaysAmount = BigDecimal.valueOf(numberOfAdditionalDays / 30); // 7.666
                additionalDaysAmount = additionalDaysAmount.multiply(country.getMonthlyPenaltyAmount()); // 7.666 * 10$ = 76.66$
                additionalDaysAmount = additionalDaysAmount.multiply(turkishLira); // 76.66$ * 14.8389 =  1137.55tl

                totalPenaltyAmount = visaFee.add(cardFee); // 1193.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira)); // 1193.60 + (50$ * 15tl) =  1193.60 + 742 = 1935.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(additionalDaysAmount); // 1935.60 + 1137.55 =  3073tl
            } else {
                assert false;
                totalPenaltyAmount = totalPenaltyAmount.add(visaFee); // 0.00 + 1033.60  = 1033.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(cardFee); // 1033.60 + 160.00 = 1193.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira)); // 1193.60 + (50$ * 15tl) =  1193.60 + 742 = 1935.60tl
            }
        } else {
            assert false;
            totalPenaltyAmount = visaFee.add(cardFee); // 1033.60 + 160.00 = 1193.60tl
        }
        return totalPenaltyAmount;
    }
}
