package com.company;

public abstract class Duck{
    protected Fly fly;
    public void setFly(Fly flyProperty){
        fly = flyProperty;
    }
    public void doFly(){
        fly.doFly();
    }

    protected Quack quack;
    public void setQuack(Quack quackProperty){
        quack = quackProperty;
    }
    public void doQuack(){
        quack.doQuack();
    }


}
