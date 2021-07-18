package com.company;

public class Task2 {

    public static void main(String[] args) {

        int n = 10;
        fibonacciElement(n);

        for (int i = 0; i <= n; i++) {
            System.out.println(recursionFibonacciElement(i));
        }

    }

    public static void fibonacciElement(int n) {

        int[] mas = new int[n + 1];
        mas[0] = 0;
        mas[1] = 1;

        for (int i = 2; i <= n; i++) {
            mas[i] = mas[i - 1] + mas[i - 2];
        }

        for (int i = 0; i <= n; i++) {
            System.out.println(mas[i]);
        }

    }

    public static int recursionFibonacciElement(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return recursionFibonacciElement(n - 1) + recursionFibonacciElement(n - 2);
    }

}