package com.company;

public class Main {

    public static void main(String[] args) {

        Seasons season = Seasons.SUMMER;
        System.out.println(season);

        switch (season) {

            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case FALL:
                System.out.println("Я люблю осень");
                break;

        }

        for (Seasons s : Seasons.values()) {

            System.out.println(s);
            System.out.println("Средняя температура: " + s.temperature);
            System.out.println(s.getDescription());

        }

    }

}
