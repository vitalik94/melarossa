package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Product> hm = new HashMap<String, Product>();

        hm.put("корабль", new Product("корабль", 100));
        hm.put("вертолет", new Product("вертолет", 291));
        hm.put("конструктор", new Product("конструктор", 216));
        hm.put("гоночный автомобиль", new Product("гоночный автомобиль", 189));
        hm.put("робот", new Product("робот", 252));

        WorkingProduct wp = new WorkingProduct();

        wp.pairsValues(hm);
        wp.setOfProductNames(hm);
        wp.productValues(hm);

    }

}
