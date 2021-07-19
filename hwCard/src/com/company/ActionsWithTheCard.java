package com.company;

import java.math.BigDecimal;

public class ActionsWithTheCard {

    public void BalanceOnCard(Card c) {

        System.out.println(c.getBalance());

    }

    public void cashWithdrawal(Card c, BigDecimal cash) {

        BigDecimal currentBalance;

        currentBalance = c.getBalance().subtract(cash);

        c.setBalance(currentBalance);

    }

    public void cashСrediting(Card c, BigDecimal cash) {

        BigDecimal currentBalance;

        currentBalance = c.getBalance().add(cash);

        c.setBalance(currentBalance);

    }

    public double transfer(Card c, Currency cu) {

        double transferBalance = 0;
        double balance = c.getBalance().doubleValue();

        switch (cu.getNameCurrency()) {

            case ("USD"):
                transferBalance = balance / cu.getExchangeRate();
                break;
            case ("EUR"):
                transferBalance = balance / cu.getExchangeRate();
                break;

        }

        return transferBalance;

    }

}
