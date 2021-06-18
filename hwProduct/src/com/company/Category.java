package com.company;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String name;
    private List<Product> product;

    public Category(String name){

        this.name = name;
        this.product = new ArrayList<Product>();

    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

        return name;

    }

    public void setProduct(List<Product> product){

        this.product = product;

    }

    public List<Product> getProduct(){

        return product;

    }

    public void add(Product p){

        product.add(p);

    }

    @Override
    public String toString() {
        return "Category{" + "name='" + name + '\'' + ", product=" + product + '}';
    }
}
