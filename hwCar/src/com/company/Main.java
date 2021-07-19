package com.company;

public class Main {

    public static void main(String[] args){

     Driver driver = new Driver("Иванов", 20, 10 );
     Engine engine = new Engine("моторс", 1000);
     Lorry lorry = new Lorry("грузовой",engine,driver, "маз",1000);
     Car car = new SportCar("легковой",engine,driver,"ford",100);

        System.out.println(lorry.toString());
        System.out.println(car.toString());

    }

}
