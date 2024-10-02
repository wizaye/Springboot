package com.wizaye;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Dev obj =context.getBean(Dev.class);
        System.out.println( "Hello World!" );
        obj.build();
    }
}
