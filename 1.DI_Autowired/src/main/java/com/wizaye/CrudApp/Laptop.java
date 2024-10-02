package com.wizaye.CrudApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compile(){
        System.out.println("Compiling the code...");
    }
    @Override
    public void debug(){
        System.out.println("Debugging the code...");
    }
}
