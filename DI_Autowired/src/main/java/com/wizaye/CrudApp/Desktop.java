package com.wizaye.CrudApp;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    // refers to primary component to render in confusion between more than one bean found for the Autowired components
public class Desktop implements Computer{
    @Override
    public void compile(){
        System.out.println("Compiling the code faster with more power...");
    }
    @Override
    public void debug(){
        System.out.println("Debugging the code...");
    }
}
