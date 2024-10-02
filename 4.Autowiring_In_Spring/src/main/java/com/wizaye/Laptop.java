package com.wizaye;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop's Constructor");
    }
    @Override
    public void compile(){
        System.out.println("Let's Compile the code in laptop...");
    }
}
