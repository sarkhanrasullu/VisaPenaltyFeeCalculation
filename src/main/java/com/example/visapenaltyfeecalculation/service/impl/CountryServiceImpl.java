package com.example.visapenaltyfeecalculation.service.impl;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;
import com.example.visapenaltyfeecalculation.service.CountryService;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private static final List<CountryDto> list = CountryDto.countriesList();

    @Override
    public List<CountryDto> getAll(){
        return list;
    }

    @Override
    public CalculatorDto calculator(Integer id, String entryDate, String visaPermit,
                                          String residenceExpiryDate, String logoutDate) throws Exception {
        BigDecimal turkishLira = returnTurkishLira();
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
        if (residenceExpiryDate.equals("null")) {
            LocalDate logoutLocalDate = dateFormat.parse(logoutDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            numberOfAdditionalMonths = entryLocalDate.until(logoutLocalDate, ChronoUnit.MONTHS); // 13ay
            numberOfAdditionalMonths = numberOfAdditionalMonths - country.getVisaDuration(); // 10ay
        } else {
            LocalDate residenceLocalDate = dateFormat.parse(residenceExpiryDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate logoutLocalDate = dateFormat.parse(logoutDate).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            numberOfAdditionalMonths = residenceLocalDate.until(logoutLocalDate, ChronoUnit.MONTHS); // 8ay
        }

        BigDecimal totalPenaltyAmount;
        if (numberOfAdditionalMonths >= 1) { // 8ay  // 10ay
            calculatorDto.setFirstMonthPenaltyAmount(country.getFirstMonthPenaltyAmount().multiply(turkishLira));
            numberOfAdditionalMonths = numberOfAdditionalMonths - 1L; // 7ay  // 9ay
            if (numberOfAdditionalMonths >= 1) { // 7ay // 9ay
                calculatorDto.setMonthlyPenaltyAmount(country.getMonthlyPenaltyAmount().multiply(turkishLira));
                BigDecimal additionalMonthsAmount = BigDecimal.valueOf(numberOfAdditionalMonths); // 7ay // 9ay
                calculatorDto.setAdditionalDaysAmount(additionalMonthsAmount); // 7ay // 9ay
                additionalMonthsAmount = additionalMonthsAmount.multiply(country.getMonthlyPenaltyAmount()); // 7 * 10$ = 70$ // 90$
                additionalMonthsAmount = additionalMonthsAmount.multiply(turkishLira); // 70$ * 14.833 =  1038.31tl // 1334.97tl

                totalPenaltyAmount = calculatorDto.getVisaFee().add(calculatorDto.getCardFee()); // 0tl + 160tl = 160tl
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira)); // 160tl + (50$ * 14.833tl) =  160tl + 741.65tl = 901.65tl
                totalPenaltyAmount = totalPenaltyAmount.add(additionalMonthsAmount); // 901.65tl + 1038.31tl = 1939.96tl // 2236.62tl
            } else {
                assert false;
                totalPenaltyAmount = calculatorDto.getVisaFee().add(calculatorDto.getCardFee()); // 0tl + 160tl = 160tl
                totalPenaltyAmount = totalPenaltyAmount.add(country.getFirstMonthPenaltyAmount().multiply(turkishLira)); // 160tl + (50$ * 14.833tl) =  160 + 741.65tl = 901.65tl
            }
        } else {
            assert false;
            totalPenaltyAmount = calculatorDto.getVisaFee().add(calculatorDto.getCardFee()); // 0tl + 160tl = 160tl
        }
        calculatorDto.setTotalPenaltyAmount(totalPenaltyAmount);
        return calculatorDto;
    }

    public BigDecimal returnTurkishLira() throws Exception {
        HttpGet get = new HttpGet("https://api.currencyapi.com/v3/latest?apikey=zFiVoXBKitrLOZRrt8gMGVnjSKVngLU4Vwuuj0ol");

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(get)) {

            final String result = EntityUtils.toString(response.getEntity());

            JSONObject jsonObject = new JSONObject(result);
            JSONObject dataJson = jsonObject.getJSONObject("data");
            JSONObject tryJson = dataJson.getJSONObject("TRY");
            return BigDecimal.valueOf(tryJson.getDouble("value"));
        }
    }
}
