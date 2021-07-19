package com.company;

public class Driver extends Person {

    private int experience;

    public Driver(String fullName, int age, int experience) {

        super(fullName, age);
        this.experience = experience;

    }

    public void setExperience(int experience) {

        this.experience = experience;

    }

    public int getExperience() {

        return experience;

    }

    @Override
    public String toString() {
        return "Driver{" + "experience=" + experience + '}';
    }
}
