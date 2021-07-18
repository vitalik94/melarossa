package com.company;

public class Task6 {

    public static void main(String[] args) {

        int[] masTurn = new int[]{25, 25, 25, 25, 50, 50, 100, 25, 25, 50};
        int[] masCash = new int[]{100, 50, 25};
        boolean b = true;

        for (int i = 0; i < masTurn.length; i++) {
            if (masTurn[i] == 100) {
                masCash[0] += masTurn[i];
                if (masCash[1] != 0 && masCash[2] != 0) {
                    masCash[1] -= (masTurn[i] / 2);
                    masCash[2] -= (masTurn[i] / 4);
                } else if (masCash[2] > 50) {
                    masCash[2] -= (masTurn[i] - masTurn[i] / 4);
                } else {
                    b = false;
                }
            } else if (masTurn[i] == 50) {
                masCash[1] += masTurn[i];
                if (masCash[2] > 0) {
                    masCash[2] -= (masTurn[i] / 2);
                } else {
                    b = false;
                }
            } else {
                masCash[2] += masTurn[i];
            }

            if (b == false) {
                System.out.println("нельзя продать билет каждому, нет сдачи");
                break;
            }
        }

        if (b == true) {
            System.out.println("билет можно продать всем");
        }
    }
}
