package com.company;

import java.math.BigDecimal;

public class Card {

    private String name;
    private int number;
    private BigDecimal balance;

    public Card(String name, int number) {

        this.name = name;
        this.number = number;

    }

    public Card(String name, int number, BigDecimal balance) {

        this.name = name;
        this.number = number;
        this.balance = balance;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setNumber(int number) {

        this.number = number;

    }

    public int getNumber() {

        return number;

    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance;

    }

    public BigDecimal getBalance() {

        return balance;

    }

}
