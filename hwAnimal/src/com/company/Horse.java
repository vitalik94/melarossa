package com.company;

public class Horse extends Animal {

    private String endurance;

    public Horse(String food, String location, String endurance) {

        super(food, location);
        this.endurance = endurance;

    }

    public void setEndurance(String endurance) {

        this.endurance = endurance;

    }

    public String getEndurance() {

        return endurance;

    }

    @Override
    public void maikNoise() {

        System.out.println("Horse издаёт звук - ггг");

    }

    @Override
    public void eat() {

        System.out.println("Horse употребляет сено, траву");

    }

}
