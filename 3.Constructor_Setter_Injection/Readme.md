# Constructor and Setter Injection in Spring

## Preface: Traditional Java Dependency Injection

### Constructor Injection
In traditional Java, you can inject dependencies via the constructor:

```java
public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    // other methods
}
```

### Setter Injection
Alternatively, you can inject dependencies using setter methods:

```java
public class Service {
    private Repository repository;

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    // other methods
}
```

## Constructor and Setter Injection in Spring

### Constructor Injection in Spring

To configure constructor injection in Spring using `spring.xml`:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="repository" class="com.example.Repository" />

    <bean id="service" class="com.example.Service">
        <constructor-arg ref="repository" />
    </bean>

</beans>
```

### Setter Injection in Spring

To configure setter injection in Spring using `spring.xml`:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="repository" class="com.example.Repository" />

    <bean id="service" class="com.example.Service">
        <property name="repository" ref="repository" />
    </bean>

</beans>
```
