package com.company;

public class RussianHen extends Hen {

    public int getCountOfEggsPerMonth(){
        return 10;
    }

    @Override
    String getDescription() {
        String a = super.getDescription() + "Моя страна -Россия. Я несу "+ this.getCountOfEggsPerMonth() + " яиц в месяц.";
        return a;
    }
}
