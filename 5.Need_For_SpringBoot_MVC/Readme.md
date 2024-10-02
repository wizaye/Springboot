# Spring VS Spring boot
1. The traditional Spring Framework requires manual configuration.
2. Everything needs to be specified in the configuration file before designing the application.
3. Spring Boot is auto-configured, and everything for the configuration can be done using annotations like `@<Annotation_Name>`.
4. Spring Boot simplifies dependency management with its starter templates.
5. It provides embedded servers like Tomcat or Jetty, eliminating the need for external server setup.
6. Spring Boot includes production-ready features such as metrics, health checks, and externalized configuration.

# Typical Web App
[![](https://mermaid.ink/img/pako:eNplkU1vgzAMhv9K5DNUdLRl5DBpW4-7DLTLxCUCt0UrCctHNVbx3xcSBlT1xYnzvK8c-wqlqBAoKM007mt2lKwJLw8FJzaqWmKpa8HJW2avvvihUJIwfCLPbXuuS-beKcmRV4pk-G1QaU86zxvs6h-GeD3XyLUzylFerCf9V5ODFM0IzIKRGgQZKmFkibNETTUv6H2awEG1f7H8u0HZkT3TzBO2eOeojeRqwdy4TM36D8_Uor_xb_NQVCu4GltbzmOA3TzvUQigQdmwurLbcXMrQJ-wwQKoPVZMfhVQ8N5yzGiRd7wEqqXBAKQwxxPQAzsrezNtNa92qraMA73CD9A4SlfJNtmlmzTe7HZxHAfQAQ3TVWojSaMosvlxve0D-BXCWqyd_NOdnV3_B4GEtqM?type=png)](https://mermaid.live/edit#pako:eNplkU1vgzAMhv9K5DNUdLRl5DBpW4-7DLTLxCUCt0UrCctHNVbx3xcSBlT1xYnzvK8c-wqlqBAoKM007mt2lKwJLw8FJzaqWmKpa8HJW2avvvihUJIwfCLPbXuuS-beKcmRV4pk-G1QaU86zxvs6h-GeD3XyLUzylFerCf9V5ODFM0IzIKRGgQZKmFkibNETTUv6H2awEG1f7H8u0HZkT3TzBO2eOeojeRqwdy4TM36D8_Uor_xb_NQVCu4GltbzmOA3TzvUQigQdmwurLbcXMrQJ-wwQKoPVZMfhVQ8N5yzGiRd7wEqqXBAKQwxxPQAzsrezNtNa92qraMA73CD9A4SlfJNtmlmzTe7HZxHAfQAQ3TVWojSaMosvlxve0D-BXCWqyd_NOdnV3_B4GEtqM)

# Spring's MVC
1. Spring uses servlets which run on the Tomcat server.
2. It follows the Model-View-Controller (MVC) design pattern.
3. Spring MVC provides a clear separation between the business logic, presentation logic, and navigation logic.
4. It supports various view technologies like JSP, Thymeleaf, and FreeMarker.
5. Spring MVC is highly configurable via XML or annotations.