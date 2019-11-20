package com.company;

public class CannotFly implements Fly {

    @Override
    public void doFly() {
        System.out.println("Duck can't fly");
    }
}
