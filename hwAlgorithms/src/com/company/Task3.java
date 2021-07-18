package com.company;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        System.out.println(factorial(n, p));
        System.out.println(recursionFactorial(n));

    }

    public static int factorial(int n, int p) {

        while (n > 0) {
            p = p * n;
            n = n - 1;
        }

        return p;

    }

    public static int recursionFactorial(int n) {

        if (n == 0 | n == 1) {
            return 1;
        } else {
            return n * recursionFactorial(n - 1);
        }

    }

}
