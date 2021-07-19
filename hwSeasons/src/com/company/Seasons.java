package com.company;

public enum Seasons {

    WINTER(-20),
    SPRING(5),
    SUMMER(25) {
        public String getDescription() {

            return "Теплое время года";

        }
    },
    FALL(5);

    int temperature;

    Seasons(int temperature) {

        this.temperature = temperature;

    }

    public String getDescription() {

        return "Холодное время года";

    }

}
