package com.wizaye;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        // not present add the dependency
        /*  1. Application Context is an interface and ClassPathXmlApplicationContext implements it.
            2. The Dev class type-cast to Dev can't be located in the default state.
            3. To eliminate the errors the configuration should be done manually under main/resources folder
            4. In the resources folder create spring.xml file to let know the spring framework that this is the config file.
        */
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj=(Dev)context.getBean(Dev.class);
       /*   1. When you run this code with only the application context and no other bean fetching, then the objects will only be created
                of the classes who's config is present in the spring.xml file.
            Dev obj =(Dev)context.getBean("dev");
            obj.build();
            System.out.println( "Hello World!" );
       */

    }
}
// JVM
    // IOC Container
        //Objects
