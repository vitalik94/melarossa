package com.company;

public class Dog extends Animal {

    private String smell;

    public Dog(String food, String location, String smell) {

        super(food, location);
        this.smell = smell;

    }

    public void setSmell(String smell) {

        this.smell = smell;

    }

    public String getSmell() {

        return smell;

    }

    @Override
    public void maikNoise() {

        System.out.println("Dog издаёт звук - гав");

    }

    @Override
    public void eat() {

        System.out.println("Dog употребляет мясо");

    }

}
