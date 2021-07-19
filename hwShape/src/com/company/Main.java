package com.company;

public class Main {

    public static void main(String[] args) {

        Shape[] s = new Shape[2];

        s[0] = new Circle();
        s[1] = new Rectangle();

        for (int i = 0; i < s.length; i++) {

            s[i].draw();

        }

    }

}
