package com.company;

public class DuckToy extends Duck {
    public DuckToy(){
        fly = new CannotFly();
    }
}
