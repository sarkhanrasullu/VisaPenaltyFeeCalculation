package com.example.visapenaltyfeecalculation.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculatorDto {

    private BigDecimal cardFee;
    private BigDecimal visaFee;
    private BigDecimal firstMonthPenaltyAmount;
    private BigDecimal monthlyPenaltyAmount;
    private BigDecimal additionalDaysAmount;
    private BigDecimal turkishLira;
    private BigDecimal totalPenaltyAmount;

    @Override
    public String toString() {
        return "CalculatorDto{" +
                "cardFee=" + cardFee +
                ", visaFee=" + visaFee +
                ", firstMonthPenaltyAmount=" + firstMonthPenaltyAmount +
                ", monthlyPenaltyAmount=" + monthlyPenaltyAmount +
                ", additionalDaysAmount=" + additionalDaysAmount +
                ", turkishLira=" + turkishLira +
                ", totalPenaltyAmount=" + totalPenaltyAmount +
                '}';
    }
}
