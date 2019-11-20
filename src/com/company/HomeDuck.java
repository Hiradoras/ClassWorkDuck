package com.company;

public class HomeDuck extends Duck {

    public HomeDuck(){
        fly = new CannotFly();
        quack = new QuckQuck();
    }


}
