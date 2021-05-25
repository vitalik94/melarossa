package com.company;

public class Task1 {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(args[0]);
        Integer b = Integer.valueOf(args[1]);
        Integer c = Integer.valueOf(args[2]);
        Integer n;
        Integer n1 = 0;
        Integer n2 = 1;
        Integer p;
        Integer k = 1;

        System.out.println(a + ", " + b + ", " + c);

        if (a >= b & a >= c) {

            n = a;

        } else if (b >= a & b >= c) {

            n = b;

        } else {

            n = c;

        }

        for (int i = 0; i < n; i++) {

            System.out.print(n1 + ", ");

            p = n1 + n2;

            n1 = n2;

            n2 = p;

        }

        System.out.println();

        p = 1;

        while (k < n) {

            p = p * ++k;

        }
        System.out.println("факториал числа " + n + " = " + p);
    }

}


