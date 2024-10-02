package com.wizaye;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Dev obj =(Dev)context.getBean("dev");
        //  obj.build();
        //  obj.setAge(18);
        System.out.println(obj.getAge());
        System.out.println( "Hello World!" );
        obj.build();
    }
}
