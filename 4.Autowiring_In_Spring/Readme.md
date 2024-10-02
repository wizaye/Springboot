# Custom Autowiring in Spring Configuration

In Spring, autowiring is a feature that enables the framework to automatically resolve and inject collaborating beans into your bean. This can be done by name, type, or constructor. Below is an example of how to configure custom autowiring in a Spring XML configuration file.

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="
    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Bean definitions here -->
    
    <!-- Autowiring by type -->
    <bean class="com.wizaye.Dev" id="dev" autowire="byType">
     <!-- Property for Computer Interface -->
     <!-- <property name="com" ref="lap1"/> -->

     <!-- This doesn't have any issue with name and ref being same (That's what autowiring is about) -->
     <!-- Since removing the property tag throws an error, what if we tell Spring how to connect automatically? -->
     <!-- <property name="com" ref="com"/> -->
    </bean>

    <!-- It becomes the primary bean -->
    <bean class="com.wizaye.Laptop" id="com1" primary="true">
    </bean>

    <bean class="com.wizaye.Desktop" id="com">
    </bean>

    <!-- Another object of the Dev with a different ID that will be created inside the IOC -->
</beans>
```

### Explanation

1. **Autowiring by Type**:
    - The `Dev` bean is configured with `autowire="byType"`. This means Spring will look for a bean of the type required by the `Dev` bean and inject it automatically.
    - If there are multiple beans of the same type, Spring will throw an exception unless one of them is marked as `primary`.

2. **Primary Bean**:
    - The `Laptop` bean is marked as `primary="true"`. This means if there are multiple beans of the same type, Spring will prefer this bean for autowiring.

3. **Bean Definitions**:
    - The `Desktop` bean is defined with the id `com`. This bean will be used for autowiring by type if no primary bean is specified or if the primary bean is not available.

By using these configurations, Spring can automatically resolve dependencies and inject the appropriate beans into your application, reducing the need for manual wiring.
