package com.company;

public class Task11 {

    public static void main(String[] args){

        int []A = new int[]{1,9,0,3,2,0,7,4};
        boolean b = false;
        int sum = 0;

        for(int i = 0; i<A.length;i++){

            if(b == true){
                sum = sum + A[i];
            }

            if(b == false & A[i]== 0){
                b = true;
            }

        }
        System.out.println(sum);
    }

}
