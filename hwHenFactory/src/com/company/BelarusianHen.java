package com.company;

public class BelarusianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 10;
    }

    @Override
    String getDescription() {
        String a = super.getDescription() + "Моя страна - Беларусь. Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
        return a;
    }
}
