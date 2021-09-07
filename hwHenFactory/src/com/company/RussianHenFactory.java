package com.company;

public class RussianHenFactory extends HenFactory{
    public Hen getHen(){
        return new RussianHen();
    }
}
