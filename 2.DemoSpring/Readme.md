# DemoSpring Project Setup

This guide will help you manually set up a Spring project with custom configuration in `spring.xml`.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse)

## Steps

### 1. Create a New Maven Project

1. Open your IDE and create a new Maven project.
2. Set the Group ID and Artifact ID (e.g., `com.example` and `demospring`).

### 2. Add Dependencies

Update the `pom.xml` file to include the necessary Spring dependencies:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.10</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.10</version>
    </dependency>
</dependencies>
```

### 3. Create `spring.xml`

Create a `spring.xml` file under `src/main/resources` and add your custom configuration:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Define your beans here -->
    <bean id="exampleBean" class="com.example.ExampleBean">
        <property name="propertyName" value="propertyValue"/>
    </bean>

</beans>
```

### 4. Create Java Classes

Create your Java classes under `src/main/java/com/example`. For example, create `ExampleBean.java`:

```java
package com.example;

public class ExampleBean {
    private String propertyName;

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void printProperty() {
        System.out.println("Property Value: " + propertyName);
    }
}
```

### 5. Load Spring Context

Create a main class to load the Spring context and test your configuration:

```java
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
        exampleBean.printProperty();
    }
}
```

### 6. Run the Application

Run the `MainApp` class to see the output and verify that your Spring configuration is working correctly.

## Conclusion

You have successfully set up a Spring project with custom configuration in `spring.xml`. You can now extend this setup by adding more beans and configurations as needed.