package com.company;

import java.math.BigDecimal;

public class Cash–°reditingException extends Exception {

    private BigDecimal cash;

    public Cash–°reditingException(BigDecimal cash){

        this.cash = cash;

    }

    public BigDecimal getCash(){

        return cash;

    }

}
