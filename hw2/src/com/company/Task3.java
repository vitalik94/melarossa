package com.company;

/*
В переменной n хранится вещественное число, с ненулевой дробной частью.
Создайте программу, округляющую число n до ближайшего
целого и выводящую результат округления на экран.
В пакете java.lang есть класс Math, а в этом классе есть 3 метода округления
чисел с плавающей точкой до ближайшего целого числа:
1.Math.round ()
2.Math.floor ()
3.Math.ceil()

 */

public class Task3 {

    public static void main(String[] args) {

        double n = 2.1;

        System.out.println(Math.round(n));
        System.out.println(Math.floor(n));
        System.out.println(Math.ceil(n));

    }

}
