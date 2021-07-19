package com.company;

public class Task7 {

    public static void main(String[] args) {

        double v = 1000.0;
        double p = 5.0;
        int d = 365;
        double s = 0;

        for (int i = 0; i < 2; i++) {

            s = s + (v + (((v * p * d) / 365) / 100));

        }

        System.out.println(s);

    }

}
