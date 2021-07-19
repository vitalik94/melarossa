package com.company;

public class Product {

    private String name;
    private int value;

    public Product(String name, int value) {

        this.name = name;
        this.value = value;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

    public void setValue(int value) {

        this.value = value;

    }

    public int getValue() {

        return value;

    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", value=" + value + '}';
    }

}
