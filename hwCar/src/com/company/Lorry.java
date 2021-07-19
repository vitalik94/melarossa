package com.company;

public class Lorry extends Car {

    private int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {

        super(carClass, engine, driver, marka);
        this.carrying = carrying;

    }

    public void setCarrying(int carrying) {

        this.carrying = carrying;

    }

    public int getCarrying() {

        return carrying;

    }

    @Override
    public String toString() {
        return "Lorry{" + "carrying=" + carrying + "} " + super.toString();
    }

}
