package com.company;

public abstract class Car {

    private String carClass;
    private Engine engine;
    private Driver driver;
    private String marka;

    public Car(String carClass, Engine engine, Driver driver, String marka) {

        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;

    }

    public void setCarClass(String carClass) {

        this.carClass = carClass;

    }

    public String getCarClass() {

        return carClass;

    }

    public void setEngine(Engine engine) {

        this.engine = engine;

    }

    public Engine getEngine() {

        return engine;

    }

    public void setDriver(Driver driver) {

        this.driver = driver;

    }

    public Driver getDriver() {

        return driver;

    }

    public void setMarka(String marka) {

        this.marka = marka;

    }

    public String getMarka() {

        return marka;

    }

    public void start() {

        System.out.println("Поехали");

    }

    public void stop() {

        System.out.println("Останавливаемся");

    }

    public void turnRight() {

        System.out.println("Поворот направо");

    }

    public void turnLeft() {

        System.out.println("Поворот налево");

    }

    @Override
    public String toString() {
        return "Car{" + "carClass='" + carClass + '\'' + ", engine=" + engine + ", driver=" + driver + ", marka='" + marka + '\'' + '}';
    }

}
