package com.company;

public class Engine {

    private String company;
    private int power;

    public Engine(String company, int power) {

        this.company = company;
        this.power = power;

    }

    public void serCompany(String company) {

        this.company = company;

    }

    public String getCompany() {

        return company;

    }

    public void serPower(int power) {

        this.power = power;

    }

    public int getPower() {

        return power;

    }

    @Override
    public String toString() {
        return "Engine{" + "company='" + company + '\'' + ", power=" + power + '}';
    }

}
