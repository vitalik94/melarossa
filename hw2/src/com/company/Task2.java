package com.company;

/*
В переменной n хранится натуральное (целое) число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task2 {

    public static void main(String[] args) {

        int n = 123;
        int a;
        int sum = 0;

        while (n > 0) {

            a = n % 10;

            sum = sum + a;

            n = n / 10;

        }

        System.out.println(sum);

    }

}
