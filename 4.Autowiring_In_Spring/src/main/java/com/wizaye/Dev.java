package com.wizaye;

//Autowired In Spring
public class Dev {
    private Computer com;
    public Dev(){
        System.out.println("Dev Constructor");
    }
    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("Lets build from scratch....");
        com.compile();
    }
}


