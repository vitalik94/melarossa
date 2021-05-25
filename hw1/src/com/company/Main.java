package com.company;

public class Main {

    public static void main(String[] args) {
        Integer a = Integer.valueOf(args[0]);
        Integer p = Integer.valueOf(args[1]);
        Double m1 = Double.valueOf(args[2]);
        Double m2 = Double.valueOf(args[3]);

        System.out.println(a);
        System.out.println(p);
        System.out.println(m1);
        System.out.println(m2);

        Double g;

        g = 4 * Math.pow(Math.PI, 2) * (Math.pow(a, 3)/ (Math.pow(p,2)*(m1 + m2)));

        System.out.println(g);

    }
}
