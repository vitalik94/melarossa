package com.company;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {

        this.food = food;
        this.location = location;

    }

    public void setFood(String food) {

        this.food = food;

    }

    public String getFood() {

        return food;

    }

    public void setLocation(String location) {

        this.location = location;

    }

    public String getLocation() {

        return location;

    }

    public void maikNoise() {

        System.out.println("Такое-то животное издаёт звук");

    }

    public void eat() {

        System.out.println("Такое-то животное ест пищу");

    }

    public void sleep() {

        System.out.println("Такое-то животное спит");

    }

}
