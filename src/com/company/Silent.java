package com.company;

public class Silent implements Quack {
    @Override
    public void doQuack() {
        System.out.println("Doesn't quack");
    }
}
