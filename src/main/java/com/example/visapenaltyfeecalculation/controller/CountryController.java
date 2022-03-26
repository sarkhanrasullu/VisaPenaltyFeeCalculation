package com.example.visapenaltyfeecalculation.controller;

import com.example.visapenaltyfeecalculation.dto.CalculatorDto;
import com.example.visapenaltyfeecalculation.dto.CountryDto;
import com.example.visapenaltyfeecalculation.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visa")
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/countries")
    public List<CountryDto> getAll() {
        return countryService.getAll();
    }

    @GetMapping("/calculator")
    public List<CalculatorDto> calculator(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) String entryDate,
            @RequestParam String visaValidityDate,
            @RequestParam(required = false) String residencePermit
    ) throws ParseException {
       return countryService.calculator(id, entryDate, visaValidityDate, residencePermit);
    }


}
