package com.wizaye.CrudApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// refers to spring understanding the class to be managed by the spring
@Component
public class Dev {
    @Autowired
    private Computer comp;
    /*  1. Instance variable by default gets null value
        2. You can solve this by using the 'new' keyword to create the object
        3. You can auto wire the component to the dev to create the objects in the IOC
    */
    public void build(){
        /* Autowired Demonstration
         * Assume that I've to call multiple methods inside this method of dev class
         * */
        comp.compile();
        comp.debug();
        System.out.println("Lets build something from scratch!!");

    }
    // Notes
    /*
    *   1. You can use the Autowired for the field injection and setter injection , for constructor injection it's default.
    *   ex:
    *       private Laptop laptop;
    *       Dev(Laptop l){
    *            this.laptop=l;         // works
    *       }
    *   ex:
    *       @Autowired ( fixes the null error)
    *       private void setLaptop(Laptop l){
    *          this.laptop=l;           // doesn't work throws null pointer error
    *       }
    * */

}
