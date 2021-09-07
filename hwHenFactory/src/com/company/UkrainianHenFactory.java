package com.company;

public class UkrainianHenFactory extends HenFactory{
    public Hen getHen(){
        return new UkrainianHen();
    }
}
