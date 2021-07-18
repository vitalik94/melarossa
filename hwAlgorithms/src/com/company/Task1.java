package com.company;

public class Task1 {

    public static void main(String[] args) {

        int[] mas = new int[]{7, 2, 9, 4, 3, 5, 2, 3, 1, 4};

        for (int i = 0; i < mas.length; i++) {
            for (int j = mas.length - 1; j > i; j--) {
                if (mas[j] < mas[j - 1]) {

                    int num = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = num;

                }
            }
        }

        for(int i : mas){

            System.out.println(i);

        }

    }

}
