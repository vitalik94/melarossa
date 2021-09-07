package com.company;

import java.util.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        List<Person> p = new ArrayList<Person>();

        p.add(new Person("Иван", 20));
        p.add(new Person("Влад", 34));
        p.add(new Person("Аня", 25));
        p.add(new Person("Сергей", 50));
        p.add(new Person("Лера", 45));

        Comparator<Person> pName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        Comparator<Person> pAge = (p1, p2) -> p1.getAge() - p2.getAge();

        Collections.sort(p, pName);
        p.forEach(s -> System.out.println(s));

        Collections.sort(p, pAge);
        p.forEach(System.out::println);

    }

}
