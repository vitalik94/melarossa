package com.company;

public class UkrainianHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 10;
    }

    @Override
    String getDescription() {
        String a = super.getDescription() + "Моя страна - Украина. Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
        return a;
    }
}
