package com.company;

public class BelarusianHenFactory extends HenFactory{
    public Hen getHen(){
        return new BelarusianHen();
    }
}
