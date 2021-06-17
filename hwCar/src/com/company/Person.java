package com.company;

public class Person {

    private String fullName;
    private int age;

    public Person(String fullName, int age) {

        this.fullName = fullName;
        this.age = age;

    }

    public void serFullName(String fullName) {

        this.fullName = fullName;

    }

    public String getFullName() {

        return fullName;

    }

    public void serAge(int age) {

        this.age = age;

    }

    public int getAge() {

        return age;

    }

    @Override
    public String toString() {
        return "Person{" + "fullName='" + fullName + '\'' + ", age=" + age + '}';
    }
}
