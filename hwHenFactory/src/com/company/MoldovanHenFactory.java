package com.company;

public class MoldovanHenFactory extends HenFactory{
    public Hen getHen(){
        return new MoldovanHen();
    }
}
