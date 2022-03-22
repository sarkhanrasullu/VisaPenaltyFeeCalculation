package com.example.visapenaltyfeecalculation.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

public interface CountryService {

    List<String> getAll();

    BigDecimal calculator(Integer id, String entryDate, String visaValidityDate, String residencePermit) throws ParseException;
}
