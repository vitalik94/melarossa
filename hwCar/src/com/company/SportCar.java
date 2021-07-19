package com.company;

public class SportCar extends Car {

    private double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka, double speed) {

        super(carClass, engine, driver, marka);
        this.speed = speed;

    }

    public void setSpeed(double speed) {

        this.speed = speed;

    }

    public double getSpeed() {

        return speed;

    }

    @Override
    public String toString() {
        return "SportCar{" + "speed=" + speed + "} " + super.toString();
    }

}
