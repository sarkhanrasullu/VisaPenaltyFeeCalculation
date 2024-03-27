package com.example.visapenaltyfeecalculation.repository.impl;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;
import com.example.visapenaltyfeecalculation.repository.CountryRepository;
import com.example.visapenaltyfeecalculation.repository.CurrencyService;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    @Autowired
    private CurrencyService currencyService;

    private static final List<CountryDto> list = CountryDto.countriesList();

    @Override
    public List<CountryDto> getAllCountries() {
        return list;
    }

    @Override
    public CalculatorDto calculator(Integer id, String entryDate, String visaPermit,
                                    String residenceExpiryDate, String logoutDate) throws Exception {
        BigDecimal turkishLira = currencyService.returnTurkishLira();
        CountryDto country = list.get(id - 1);

        CalculatorDto calculatorDto = new CalculatorDto();
        calculatorDto.setFirstMonthPenaltyAmount(BigDecimal.valueOf(0));
        calculatorDto.setMonthlyPenaltyAmount(BigDecimal.valueOf(0));
        calculatorDto.setAdditionalDaysAmount(BigDecimal.valueOf(0));
        calculatorDto.setCardFee(country.getCardFee());
        calculatorDto.setTurkishLira(turkishLira);

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate entryLocalDate = dateFormat.parse(entryDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        if (visaPermit.equals("No") && country.getVisaFee().equals(BigDecimal.valueOf(1033.60))) {
            calculatorDto.setVisaFee(country.getVisaFee());
        } else {
            calculatorDto.setVisaFee(BigDecimal.valueOf(0.00));
        }

        long numberOfAdditionalMonths;
        if ("null".equalsIgnoreCase(residenceExpiryDate) || residenceExpiryDate==null || residenceExpiryDate.trim().length()==0) {
            LocalDate logoutLocalDate = dateFormat.parse(logoutDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            numberOfAdditionalMonths = entryLocalDate.until(logoutLocalDate, ChronoUnit.MONTHS);
            numberOfAdditionalMonths = numberOfAdditionalMonths - country.getVisaDuration();
        } else {
            LocalDate residenceLocalDate = dateFormat.parse(residenceExpiryDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate logoutLocalDate = dateFormat.parse(logoutDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            numberOfAdditionalMonths = residenceLocalDate.until(logoutLocalDate, ChronoUnit.MONTHS);
        }

        BigDecimal totalPenaltyAmount;
        if (numberOfAdditionalMonths >= 1) {
            calculatorDto.setFirstMonthPenaltyAmount(country.getFirstMonthPenaltyAmount().multiply(turkishLira));
            numberOfAdditionalMonths = numberOfAdditionalMonths - 1L;
            if (numberOfAdditionalMonths >= 1) {
                calculatorDto.setMonthlyPenaltyAmount(country.getMonthlyPenaltyAmount().multiply(turkishLira));
                BigDecimal additionalMonthsAmount = BigDecimal.valueOf(numberOfAdditionalMonths);
                calculatorDto.setAdditionalDaysAmount(additionalMonthsAmount);
                additionalMonthsAmount = additionalMonthsAmount.multiply(country.getMonthlyPenaltyAmount());
                additionalMonthsAmount = additionalMonthsAmount.multiply(turkishLira);

                totalPenaltyAmount = calculatorDto.getVisaFee().add(calculatorDto.getCardFee());
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira));
                totalPenaltyAmount = totalPenaltyAmount.add(additionalMonthsAmount);
            } else {
                assert false;
                totalPenaltyAmount = calculatorDto.getVisaFee().add(calculatorDto.getCardFee());
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira));
            }
        } else {
            assert false;
            totalPenaltyAmount = calculatorDto.getVisaFee().add(calculatorDto.getCardFee());
        }
        calculatorDto.setTotalPenaltyAmount(totalPenaltyAmount);
        return calculatorDto;
    }

}
