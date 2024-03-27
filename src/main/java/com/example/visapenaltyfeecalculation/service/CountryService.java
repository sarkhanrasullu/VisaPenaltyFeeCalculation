package com.example.visapenaltyfeecalculation.service;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;

import java.util.List;

public interface CountryService {

    List<CountryDto> getAllCountries();

    CalculatorDto calculator(Integer id, String entryDate, String visaPermit,
                                   String residenceExpiryDate, String logoutDate) throws Exception;
}
