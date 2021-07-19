package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<HeavyBox> hb = new ArrayList<HeavyBox>();

        hb.add(new HeavyBox(100, "watermelons"));
        hb.add(new HeavyBox(385, "instruments"));
        hb.add(new HeavyBox(167, "jeans"));
        hb.add(new HeavyBox(263, "banans"));
        hb.add(new HeavyBox(284, "buckwheat"));

        for (HeavyBox box : hb) {

            System.out.println(box);

        }

        System.out.println();

        hb.get(0).setWeight(hb.get(0).getWeight() + 1);

        for (HeavyBox box : hb) {

            System.out.println(box);

        }

        System.out.println();

        hb.remove(hb.size() - 1);

        for (HeavyBox box : hb) {

            System.out.println(box);

        }

        System.out.println();

        for(int i = 0 ; i < hb.size(); i++){

            System.out.println(hb.get(i));

        }

        System.out.println();

        Iterator iterator = hb.iterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());

        }

        hb.clear();

    }

}
