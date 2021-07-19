package com.company;

import java.math.BigDecimal;

public class ActionsWithTheCard {

    public void BalanceOnCard(Card c) {

        System.out.println(c.getBalance());

    }

    public void cashWithdrawal(Card c, BigDecimal cash) throws CashСreditingException {

        BigDecimal currentBalance;

        if (cash.compareTo(c.getBalance()) == -1 | cash.compareTo(c.getBalance()) == 0) {

            currentBalance = c.getBalance().subtract(cash);

            c.setBalance(currentBalance);

        } else {

            throw new CashСreditingException(c.getBalance());

        }

    }

    public void cashСrediting(Card c, BigDecimal cash) {

        BigDecimal currentBalance;

        currentBalance = c.getBalance().add(cash);

        c.setBalance(currentBalance);

    }

    public double transfer(Card c, Currency cu) {

        double transferBalance = 0;
        double balance = c.getBalance().doubleValue();

        transferBalance = balance / cu.getExchangeRate();

        return transferBalance;

    }

}
