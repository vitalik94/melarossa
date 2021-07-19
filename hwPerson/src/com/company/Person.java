package com.company;

public class Person {

    private String fullName;
    private int age;

    public Person(){

    }

    public Person(String fullName, int age){

        this.fullName = fullName;
        this.age = age;

    }

    public void setFullName(String fullName){

        this.fullName = fullName;

    }

    public String getFullName(){

        return fullName;

    }

    public void setAge(int age){

        this.age = age;

    }

    public int getAge(){

        return age;

    }

    public void move(){

        System.out.println("Такой-то  Person идет");

    }

    public void talk(){

        System.out.println("Такой-то  Person говорит");

    }



}
