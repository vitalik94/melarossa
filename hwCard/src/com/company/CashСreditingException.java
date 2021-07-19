package com.company;

import java.math.BigDecimal;

public class CashСreditingException extends Exception {

    private BigDecimal cash;

    public CashСreditingException(BigDecimal cash){

        this.cash = cash;

    }

    public BigDecimal getCash(){

        return cash;

    }

}
