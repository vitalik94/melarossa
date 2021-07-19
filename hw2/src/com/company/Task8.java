package com.company;

public class Task8 {

    public static void main(String[] args) {

        final int h = 200;
        final int w = 70;

        int iw = h - 110;

        if (w > iw) {

            iw = w - iw;

            System.out.println("нужно сбросить " + iw + " кг");

        } else {

            iw = iw - w;

            System.out.println("нужно набрать " + iw + " кг");

        }

    }

}
