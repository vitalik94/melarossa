package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WorkingProduct {

    public void pairsValues(HashMap<String, Product> hm) {

        for (Map.Entry entry : hm.entrySet()) {

            System.out.println(entry);

        }

    }

    public void setOfProductNames(HashMap<String, Product> hm) {

        Set<String> keys = hm.keySet();
        System.out.println("ключи: " + keys);

    }

    public void productValues(HashMap<String, Product> hm) {

        Collection<Product> values = hm.values();
        System.out.println("значения: " + values);

    }

}
