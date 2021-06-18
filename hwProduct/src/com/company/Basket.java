package com.company;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> bought;

    public Basket() {

        this.bought = new ArrayList<Product>();

    }

    public void setBought() {

        this.bought = bought;

    }

    public List<Product> getBought() {

        return bought;

    }

    public void add(Product p) {

        bought.add(p);

    }

    @Override
    public String toString() {
        return "Basket{" + "bought=" + bought + '}';
    }

}
