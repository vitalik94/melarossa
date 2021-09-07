package com.company;

public class Main {

    public static void main(String[] args){
        ThreeFunction tf;

        tf = (x,y,z)->Math.pow(x,2) + Math.pow(y,2)+Math.pow(z,2);
        System.out.println(tf.actionWithNum(38,59,23));

        tf = (x,y,z)->(x+y+z)/(x*y*z);
        System.out.println(tf.actionWithNum(53,48,61));
    }

}
