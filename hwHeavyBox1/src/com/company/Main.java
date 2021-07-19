package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args){

        Deque<HeavyBox> hb = new ArrayDeque<HeavyBox>();

        hb.add(new HeavyBox(100, "watermelons"));
        hb.add(new HeavyBox(385, "instruments"));
        hb.add(new HeavyBox(167, "jeans"));
        hb.add(new HeavyBox(263, "banans"));
        hb.add(new HeavyBox(284, "buckwheat"));

        hb.offer(new HeavyBox(164, "pear"));

        for(HeavyBox hbox: hb){

            System.out.println(hbox);

        }

        System.out.println();

        hb.poll();

        for(HeavyBox hbox: hb){

            System.out.println(hbox);

        }

    }

}
