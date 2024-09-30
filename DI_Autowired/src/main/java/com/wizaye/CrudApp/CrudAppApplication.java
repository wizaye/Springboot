package com.wizaye.CrudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudAppApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CrudAppApplication.class, args);
		/*
			1. Manually creating the object inside the JVM but not in the IOC Controller
			2. It is our responsibility to check upon the object lifecycle ( i.e creation ,managing , destroying).
			3. It can be done using this snippet
				Dev obj=new Dev();
				obj.build();
		*/
		/*
		 	1. Dependency Injection can be achieved using IOC in Spring Framework.
		 	2. The Idea behind this is there exists objects in the IOC of JVM and we need to use them without explicitly creating an object.
		 	3. To Achieve this we can assign the SpringApplication.run() to an Application Context from spring.
		 	4. Using the application context we can run the methods from the other classes.
		 	5. Spring By default doesn't create the objects for classes we need to specify what class's objects should be added to the IOC Controller.
		 */
		Dev obj=context.getBean(Dev.class);
		obj.build();

	}

}
/*
 * Dependency Injection
 */
//JVM
	//IOC Controller
		//Object

