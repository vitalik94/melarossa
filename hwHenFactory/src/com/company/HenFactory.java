package com.company;

public abstract class HenFactory {

    public String chooseHen(){
        Hen hen = getHen();
        return hen.getDescription();
    }
    public abstract Hen getHen();
}
