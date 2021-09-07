package com.company;

/*
Implement each of main Java Standard Library functional interfaces (supplier, predicate etc.) using lambda expressions.
Create your own functional interface and add several implementations using both lambda expressions and inner anonymous classes.
Add few default methods to it and use them.
Add few static methods to it and use them.
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args){

        Predicate<Integer> pr = x-> x>0;
        System.out.println(pr.test(10));

        Consumer<Integer> co = x-> System.out.println(x + " лошадиных сил");
        co.accept(100);

        Function<String,Integer> fu = x-> Integer.parseInt(x);
        System.out.println(fu.apply("100"));


        СurrencyTransfer currency;

        currency = (a,b)->a/b;

        System.out.println(currency.transfer(10.0,2.52));

        СurrencyTransfer c = new СurrencyTransfer() {
            public double transfer(double a, double b) {
                return a/b;
            }
        };

        //default method
        c.start();

        System.out.println(c.transfer(125.0,2.52));

        //static method
        System.out.println(СurrencyTransfer.sum(4197,3748));

    }

}
