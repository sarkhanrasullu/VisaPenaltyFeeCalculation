package com.example.visapenaltyfeecalculation.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

    private int id;
    private String countryGroup;
    private String country;
    private int visaDuration;
    private BigDecimal firstMonthPenaltyAmount;
    private BigDecimal monthlyPenaltyAmount;

    public int getId() {
        return id;
    }

    public CountryDto setId(int id) {
        this.id = id;
        return this;
    }

    public String getCountryGroup() {
        return countryGroup;
    }

    public CountryDto setCountryGroup(String countryGroup) {
        this.countryGroup = countryGroup;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public CountryDto setCountry(String country) {
        this.country = country;
        return this;
    }

    public int getVisaDuration() {
        return visaDuration;
    }

    public CountryDto setVisaDuration(int visaDuration) {
        this.visaDuration = visaDuration;
        return this;
    }

    public BigDecimal getFirstMonthPenaltyAmount() {
        return firstMonthPenaltyAmount;
    }

    public CountryDto setFirstMonthPenaltyAmount(BigDecimal firstMonthPenaltyAmount) {
        this.firstMonthPenaltyAmount = firstMonthPenaltyAmount;
        return this;
    }

    public BigDecimal getMonthlyPenaltyAmount() {
        return monthlyPenaltyAmount;
    }

    public CountryDto setMonthlyPenaltyAmount(BigDecimal monthlyPenaltyAmount) {
        this.monthlyPenaltyAmount = monthlyPenaltyAmount;
        return this;
    }



    @Override
    public String toString() {
        return "Countries{" +
                "id = " + id +
                ", countryGroup = '" + countryGroup + '\'' +
                ", country = '" + country + '\'' +
                ", visaDuration = " + visaDuration +
                ", firstMonthPenaltyAmount = " + firstMonthPenaltyAmount +
                ", monthlyPenaltyAmount = " + monthlyPenaltyAmount +
                '}';
    }

    public static List<CountryDto> countriesList(){
        List<CountryDto> list = new ArrayList<>();
        list.add(new CountryDto()
                .setId(1)
                .setCountryGroup("A")
                .setCountry("Afganistan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(2)
                .setCountryGroup("A")
                .setCountry("Almanya")
                .setVisaDuration(2)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(3)
                .setCountryGroup("A")
                .setCountry("Amerika Birleşik Devletleri")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(4)
                .setCountryGroup("A")
                .setCountry("Andora")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(5)
                .setCountryGroup("A")
                .setCountry("Angola")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(6)
                .setCountryGroup("A")
                .setCountry("Antigua-Barbuda")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(7)
                .setCountryGroup("A")
                .setCountry("Arjantin")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(8)
                .setCountryGroup("A")
                .setCountry("Avustralya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(9)
                .setCountryGroup("A")
                .setCountry("Avusturya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(10)
                .setCountryGroup("A")
                .setCountry("Azerbaycan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(11)
                .setCountryGroup("A")
                .setCountry("Bahama")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(12)
                .setCountryGroup("A")
                .setCountry("Bahreyn")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(13)
                .setCountryGroup("A")
                .setCountry("Bangladeş")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(14)
                .setCountryGroup("A")
                .setCountry("Barbados")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(15)
                .setCountryGroup("A")
                .setCountry("Belize")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(16)
                .setCountryGroup("A")
                .setCountry("Benin")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(17)
                .setCountryGroup("A")
                .setCountry("Bhutan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(18)
                .setCountryGroup("A")
                .setCountry("Birleşik Arap Emirlikleri")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(19)
                .setCountryGroup("A")
                .setCountry("Bolivya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(20)
                .setCountryGroup("A")
                .setCountry("Bosna Hersek")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(21)
                .setCountryGroup("A")
                .setCountry("Bostwana")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(22)
                .setCountryGroup("A")
                .setCountry("Brezilya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(23)
                .setCountryGroup("A")
                .setCountry("Brunei")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(24)
                .setCountryGroup("A")
                .setCountry("Bulgaristan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(25)
                .setCountryGroup("A")
                .setCountry("Burkina Faso")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(26)
                .setCountryGroup("A")
                .setCountry("Burundi")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(27)
                .setCountryGroup("A")
                .setCountry("Cape Verde")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(28)
                .setCountryGroup("A")
                .setCountry("Cibuti")
                .setVisaDuration(2)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(29)
                .setCountryGroup("A")
                .setCountry("Cook Adaları")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(30)
                .setCountryGroup("A")
                .setCountry("Çad")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(31)
                .setCountryGroup("A")
                .setCountry("Çin Halk Cumhuriyeti")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(32)
                .setCountryGroup("A")
                .setCountry("Doğu Timor")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(33)
                .setCountryGroup("A")
                .setCountry("Dominik")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(34)
                .setCountryGroup("A")
                .setCountry("Dominika")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(35)
                .setCountryGroup("A")
                .setCountry("Ekvator")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(36)
                .setCountryGroup("A")
                .setCountry("Ekvator Ginesi")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(37)
                .setCountryGroup("A")
                .setCountry("El Salvador")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(38)
                .setCountryGroup("A")
                .setCountry("Endonezya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(39)
                .setCountryGroup("A")
                .setCountry("Eritre")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(40)
                .setCountryGroup("A")
                .setCountry("Ermenistan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(41)
                .setCountryGroup("A")
                .setCountry("Estonya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(42)
                .setCountryGroup("A")
                .setCountry("Filistin")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(43)
                .setCountryGroup("A")
                .setCountry("Finlandiya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(44)
                .setCountryGroup("A")
                .setCountry("Fransa")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(45)
                .setCountryGroup("A")
                .setCountry("Gabon")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(46)
                .setCountryGroup("A")
                .setCountry("Gambiya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(47)
                .setCountryGroup("A")
                .setCountry("Gana")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(48)
                .setCountryGroup("A")
                .setCountry("Gine")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(49)
                .setCountryGroup("A")
                .setCountry("Gine-Bissau")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(50)
                .setCountryGroup("A")
                .setCountry("Grenada")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(51)
                .setCountryGroup("A")
                .setCountry("Guatemala")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(52)
                .setCountryGroup("A")
                .setCountry("Guyana")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(53)
                .setCountryGroup("A")
                .setCountry("Güney Afrika")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(54)
                .setCountryGroup("A")
                .setCountry("Güney Kıbrıs Rum Kesimi")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(55)
                .setCountryGroup("A")
                .setCountry("Gürcistan")
                .setVisaDuration(2)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(56)
                .setCountryGroup("A")
                .setCountry("Haiti")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(57)
                .setCountryGroup("A")
                .setCountry("Hırvatistan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(58)
                .setCountryGroup("A")
                .setCountry("Hindistan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(59)
                .setCountryGroup("A")
                .setCountry("Hollanda")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(60)
                .setCountryGroup("A")
                .setCountry("Honduras")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(61)
                .setCountryGroup("A")
                .setCountry("İngiltere")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(62)
                .setCountryGroup("A")
                .setCountry("İran")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(63)
                .setCountryGroup("A")
                .setCountry("İsveç")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(64)
                .setCountryGroup("A")
                .setCountry("İsviçre")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(65)
                .setCountryGroup("A")
                .setCountry("İtalya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(66)
                .setCountryGroup("A")
                .setCountry("İzlanda")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(67)
                .setCountryGroup("A")
                .setCountry("Jamaika")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(68)
                .setCountryGroup("A")
                .setCountry("Kamerun")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(69)
                .setCountryGroup("A")
                .setCountry("Kanada")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(70)
                .setCountryGroup("A")
                .setCountry("Katar")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(71)
                .setCountryGroup("A")
                .setCountry("Kazakistan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(72)
                .setCountryGroup("A")
                .setCountry("Kenya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(73)
                .setCountryGroup("A")
                .setCountry("Kırgizstan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(74)
                .setCountryGroup("A")
                .setCountry("Kiribati")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(75)
                .setCountryGroup("A")
                .setCountry("Kolombiya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(76)
                .setCountryGroup("A")
                .setCountry("Komor")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(77)
                .setCountryGroup("A")
                .setCountry("Kongo")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(78)
                .setCountryGroup("A")
                .setCountry("Kuzey Kore")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(79)
                .setCountryGroup("A")
                .setCountry("Kosta ri ka")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(80)
                .setCountryGroup("A")
                .setCountry("Kuzey Kıbrıs Türk Cum")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(81)
                .setCountryGroup("A")
                .setCountry("Küba")
                .setVisaDuration(2)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(82)
                .setCountryGroup("A")
                .setCountry("Laos")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(83)
                .setCountryGroup("A")
                .setCountry("Lesotho")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(84)
                .setCountryGroup("A")
                .setCountry("Letonya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(85)
                .setCountryGroup("A")
                .setCountry("Liberya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(86)
                .setCountryGroup("A")
                .setCountry("Libya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(87)
                .setCountryGroup("A")
                .setCountry("Lihtenştayn")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(88)
                .setCountryGroup("A")
                .setCountry("Litvanya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(89)
                .setCountryGroup("A")
                .setCountry("Lübnana")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(90)
                .setCountryGroup("A")
                .setCountry("Macaristan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(91)
                .setCountryGroup("A")
                .setCountry("Madagaskar(Malagazi)")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(92)
                .setCountryGroup("A")
                .setCountry("Malavi")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(93)
                .setCountryGroup("A")
                .setCountry("Maldivler")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(94)
                .setCountryGroup("A")
                .setCountry("Malezya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(95)
                .setCountryGroup("A")
                .setCountry("Marshall Adaları")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(96)
                .setCountryGroup("A")
                .setCountry("Mauritius")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(97)
                .setCountryGroup("A")
                .setCountry("Meksika")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(98)
                .setCountryGroup("A")
                .setCountry("Moğolistan")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(99)
                .setCountryGroup("A")
                .setCountry("Moldova")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(100)
                .setCountryGroup("A")
                .setCountry("Monako")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(101)
                .setCountryGroup("A")
                .setCountry("Moritanya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(102)
                .setCountryGroup("A")
                .setCountry("Mozombik")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(103)
                .setCountryGroup("A")
                .setCountry("Myanmar(Burma,Birmanya)")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(104)
                .setCountryGroup("A")
                .setCountry("Namibya")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(105)
                .setCountryGroup("A")
                .setCountry("Nauru")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));
        list.add(new CountryDto()
                .setId(106)
                .setCountryGroup("A")
                .setCountry("Nijer")
                .setVisaDuration(3)
                .setFirstMonthPenaltyAmount(BigDecimal.valueOf(50))
                .setMonthlyPenaltyAmount(BigDecimal.valueOf(10)));

        return list;
    }
}
