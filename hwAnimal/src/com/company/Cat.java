package com.company;

public class Cat extends Animal {

    private String agility;

    public Cat(String food, String location, String agility) {

        super(food, location);
        this.agility = agility;

    }

    public void setAgility(String agility) {

        this.agility = agility;

    }

    public String getAgility() {

        return agility;

    }

    @Override
    public void maikNoise() {

        System.out.println("Cat издаёт звук - мяу");

    }

    @Override
    public void eat() {

        System.out.println("Cat употребляет мясо");

    }

}
