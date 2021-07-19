package com.company;

public class Task9 {

    public static void main(String[] args) {

        double sek = 200000;
        double d1;
        int d;
        double h1;
        int h;
        double m1;
        int m;
        double s1;
        int s;

        d1 = (((sek / 60) / 60) / 24);
        d = (int) Math.floor(d1);
        h1 = (d1 - d) * 24;
        h = (int) Math.floor(h1);
        m1 = (h1 - h) * 60;
        m = (int) Math.floor(m1);
        s1 = (m1 - m) * 60;
        s = (int) Math.floor(s1);

        System.out.println("дней " + d + ", " + "часов " + h + ", " + "минут " + m + ", " + "секунд " + s);

    }

}
