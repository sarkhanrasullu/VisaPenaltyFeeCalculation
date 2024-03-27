package com.example.visapenaltyfeecalculation.repository;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;
import java.util.List;

public interface CountryRepository {

    List<CountryDto> getAllCountries();

    CalculatorDto calculator(Integer id, String entryDate, String visaPermit,
                             String residenceExpiryDate, String logoutDate) throws Exception;
}
