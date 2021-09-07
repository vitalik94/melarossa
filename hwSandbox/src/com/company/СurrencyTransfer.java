package com.company;

public interface СurrencyTransfer {

    double transfer(double a, double b);

    default void start(){
        System.out.println("Введите данные:");
    }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

}
