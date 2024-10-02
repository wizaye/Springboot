package com.wizaye;

//Setter and Constructor Injection
public class Dev {
    private Laptop laptop;
    private int age;
    public Dev(){
        System.out.println("Dev Constructor");
    }
    // Generic Constructor Injection Using OOPS
    public Dev(int age, Laptop laptop){
        this.age=age;
        this.laptop=laptop;
        System.out.println("Parameterised Dev Constructor");
    }
    public int getAge(){
        return this.age;
    }
    // Generic Way of Setter Injection Using OOPS.
    /*
        public void setAge(int age){
             this.age=age;
        }
     */

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Lets build from scratch....");
        laptop.compile();
    }
}


