package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Card c = new Card("Иван", 1234, BigDecimal.valueOf(1000));
        Currency cu = new Currency("USD", 2.49);

        ActionsWithTheCard acard = new ActionsWithTheCard();

        acard.BalanceOnCard(c);

        acard.cashWithdrawal(c, BigDecimal.valueOf(100));
        System.out.println(c.getBalance());

        acard.cashСrediting(c, BigDecimal.valueOf(200));
        System.out.println(c.getBalance());

        System.out.println(acard.transfer(c, cu));


    }

}
