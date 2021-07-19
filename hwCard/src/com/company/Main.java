package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Card c = new Card("Иван", 1234, BigDecimal.valueOf(1000));
        Currency cu = new Currency("USD", 2.49);

        ActionsWithTheCard acard = new ActionsWithTheCard();

        acard.BalanceOnCard(c);
      
        try {

            acard.cashWithdrawal(c, BigDecimal.valueOf(100));
            System.out.println(c.getBalance());

        }catch(CashСreditingException e){

            System.out.println("на балансе " + c.getBalance());
            e.printStackTrace();

        }

        acard.cashСrediting(c, BigDecimal.valueOf(200));
        System.out.println(c.getBalance());

        System.out.println(acard.transfer(c, cu));

    }

}
