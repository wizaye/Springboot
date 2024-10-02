package com.wizaye;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop's Constructor");
    }
    @Override
    public void compile(){
        System.out.println("Let's Compile the code in desktop...");
    }
}
