package com.company;

import java.math.BigDecimal;

public class Currency {

    private String nameCurrency;
    private double exchangeRate;

    public Currency(String nameCurrency, double exchangeRate) {

        this.nameCurrency = nameCurrency;
        this.exchangeRate = exchangeRate;

    }

    public void setNameCurrency(String nameCurrency) {

        this.nameCurrency = nameCurrency;

    }

    public String getNameCurrency() {

        return nameCurrency;

    }

    public void setExchangeRate(double exchangeRate) {

        this.exchangeRate = exchangeRate;

    }

    public double getExchangeRate() {

        return exchangeRate;

    }

}
