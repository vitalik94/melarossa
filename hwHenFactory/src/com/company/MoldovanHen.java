package com.company;

public class MoldovanHen extends Hen{
    public int getCountOfEggsPerMonth(){
        return 10;
    }

    @Override
    String getDescription() {
        String a = super.getDescription() + "Моя страна - Молдова. Я несу "+ this.getCountOfEggsPerMonth() +" яиц в месяц.";
        return a;
    }
}
