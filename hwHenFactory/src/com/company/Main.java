package com.company;

public class Main {

    private static HenFactory hf;
    public static void main(String[] args){
        String contry = "Беларусь";
       // chooseFactory(contry);
        System.out.println(chooseFactory(contry));

    }

    static String chooseFactory(String contry){
        switch(contry){
            case("Беларусь"):
                hf = new BelarusianHenFactory();
                break;
            case("Украина"):
                hf = new UkrainianHenFactory();
                break;
            case("Россия"):
                hf = new RussianHenFactory();
                break;
            case("Молдова"):
                hf = new MoldovanHenFactory();
                break;
        }
       return hf.chooseHen();
    }
}
