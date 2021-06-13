package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] a = new Animal[3];
        a[0] = new Cat("мясо", "дом", "высокая");
        a[1] = new Dog("мясо", "дом", "высокое");
        a[2] = new Horse("трава", "поле", "высокая");

        Vet v = new Vet();

        for (int i = 0; i < a.length; i++) {

            v.treatAnimal(a[i]);

        }


    }

}
