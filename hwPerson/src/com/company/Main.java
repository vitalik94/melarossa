package com.company;

public class Main {

    public static void main(String[] args){

        Person p = new Person();
        Person p1 = new Person("Иванов Иван Иванович",20);

        System.out.println(p1.getFullName());
        System.out.println(p1.getAge());

        p.move();
        p1.talk();

    }

}
