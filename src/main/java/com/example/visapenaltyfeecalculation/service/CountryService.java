package com.example.visapenaltyfeecalculation.service;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

public interface CountryService {

    List<CountryDto> getAll();

    CalculatorDto calculator(Integer id, String entryDate, String visaPermit,
                                   String residenceExpiryDate, String logoutDate) throws ParseException;
}
