package com.example.visapenaltyfeecalculation.service.impl;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;
import com.example.visapenaltyfeecalculation.repository.CountryRepository;
import com.example.visapenaltyfeecalculation.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public List<CountryDto> getAllCountries() {
        return countryRepository.getAllCountries();
    }

    @Override
    public CalculatorDto calculator(Integer id, String entryDate, String visaPermit, String residenceExpiryDate,
                                    String logoutDate) throws Exception {
        return countryRepository.calculator(id, entryDate, visaPermit, residenceExpiryDate, logoutDate);
    }
}
