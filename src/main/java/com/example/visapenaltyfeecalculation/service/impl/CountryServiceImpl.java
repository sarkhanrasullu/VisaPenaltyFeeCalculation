package com.example.visapenaltyfeecalculation.service.impl;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;
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

    private static final List<CountryDto> list = CountryDto.countriesList();
    private static final BigDecimal turkishLira = BigDecimal.valueOf(14.8389);

    @Override
    public List<CountryDto> getAll() {
        return list;
    }

    @Override
    public List<CalculatorDto> calculator(Integer id, String entryDate, String visaValidityDate, String residencePermit) throws ParseException {
        List<CalculatorDto> calculatorDtoList = new ArrayList<>();
        CalculatorDto calculatorDto = new CalculatorDto();

        CountryDto country = list.get(id - 1);
        calculatorDto.setFirstMonthPenaltyAmount(BigDecimal.valueOf(0));
        calculatorDto.setMonthlyPenaltyAmount(BigDecimal.valueOf(0));
        calculatorDto.setAdditionalDaysAmount(BigDecimal.valueOf(0));
        calculatorDto.setCardFee(country.getCardFee());
        calculatorDto.setTurkishLira(turkishLira);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate entryLocalDate = dateFormat.parse(entryDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long differentDateOfDays;
        if (visaValidityDate.equals("null")) {
            LocalDate currentDate = Instant.now().atZone(ZoneId.systemDefault()).toLocalDate();
            differentDateOfDays = entryLocalDate.until(currentDate, ChronoUnit.DAYS);
        } else {
            LocalDate validityLocalDate = dateFormat.parse(visaValidityDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            differentDateOfDays = entryLocalDate.until(validityLocalDate, ChronoUnit.DAYS);
        }

        BigDecimal cardFee = country.getCardFee();
        BigDecimal visaFee;
        if (residencePermit.equals("No") && country.getVisaFee().equals(BigDecimal.valueOf(1033.6))){
            visaFee = BigDecimal.valueOf(1033.60);
        } else {
            visaFee = BigDecimal.valueOf(0.00);
        }
        calculatorDto.setVisaFee(visaFee);

        long numberOfAdditionalDays = differentDateOfDays - (country.getVisaDuration() * 30L); // 350 - 90 = 260

        BigDecimal totalPenaltyAmount = null;
        if (numberOfAdditionalDays >= 30){
            calculatorDto.setFirstMonthPenaltyAmount(country.getFirstMonthPenaltyAmount().multiply(turkishLira));
            numberOfAdditionalDays = numberOfAdditionalDays - 30L; // 230
            if (numberOfAdditionalDays >= 30) {
                calculatorDto.setMonthlyPenaltyAmount(country.getMonthlyPenaltyAmount().multiply(turkishLira));
                BigDecimal additionalDaysAmount = BigDecimal.valueOf(numberOfAdditionalDays / 30); // 7.666
                calculatorDto.setAdditionalDaysAmount(additionalDaysAmount);
                additionalDaysAmount = additionalDaysAmount.multiply(country.getMonthlyPenaltyAmount()); // 7.666 * 10$ = 76.66$
                additionalDaysAmount = additionalDaysAmount.multiply(turkishLira); // 76.66$ * 14.8389 =  1137.55tl

                totalPenaltyAmount = visaFee.add(cardFee); // 1193.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira)); // 1193.60 + (50$ * 15tl) =  1193.60 + 742 = 1935.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(additionalDaysAmount); // 1935.60 + 1137.55 =  3073tl
            } else {
                assert false;
                totalPenaltyAmount = visaFee.add(cardFee); // 1033.60 + 160.00 = 1193.60tl
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira)); // 1193.60 + (50$ * 15tl) =  1193.60 + 742 = 1935.60tl
            }
        } else {
            assert false;
            totalPenaltyAmount = visaFee.add(cardFee); // 1033.60 + 160.00 = 1193.60tl
        }
        calculatorDto.setTotalPenaltyAmount(totalPenaltyAmount);
        calculatorDtoList.add(calculatorDto);
        return calculatorDtoList;
    }
}
