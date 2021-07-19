package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Category category = new Category("одежда");
        category.add(new Product("джинсы",100,10));
        Category category1 = new Category("спортивный инвертарь");
        category1.add(new Product("мяч",1000,10));

        Basket b = new Basket();
        b.add(new Product("джинсы",100,10));

        User u = new User("Иван",1234,b);

        System.out.println(u.toString());

    }

}
