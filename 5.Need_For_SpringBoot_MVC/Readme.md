# Spring VS Spring boot
1. The traditional Spring Framework requires manual configuration.
2. Everything needs to be specified in the configuration file before designing the application.
3. Spring Boot is auto-configured, and everything for the configuration can be done using annotations like `@<Annotation_Name>`.
4. Spring Boot simplifies dependency management with its starter templates.
5. It provides embedded servers like Tomcat or Jetty, eliminating the need for external server setup.
6. Spring Boot includes production-ready features such as metrics, health checks, and externalized configuration.

# Typical Web App
1. [![](https://mermaid.ink/img/pako:eNplkc9ugzAMxl8l8hkqOloYOVTaxgus1S4TlwjcFg0Slj_VGOLdFwIDqvoSx_l9nxy7g1wUCBSUZhrTkl0kq_3bU8aJjQ-Fkvj-gbw0TVXmTJeCE0pOyAtFjvhtUOmRdPI7rBsfhnirSuTaGZ1Q3qwn_VeTsxT1BCyCiRoER1TCyBwXiZpro6AfjxkcVOmr5d8NypakTLORsMUHR20kVyvmzmVudvzwQq36m_62DEU1gquptfU8BtjN8xEFD2qUNSsLuwg3twz0FWvMgNq0YPIrg4z3lmNGi1PLc6BaGvRACnO5Aj2zStmbaYpli3O1YRxoBz9AwyDZxPs4SnZJuIuiMAw9aIH6ySaxESdBENjzebvvPfgVwlpsnfzT5c6u_wOYQrB6?type=png)](https://mermaid.live/edit#pako:eNplkc9ugzAMxl8l8hkqOloYOVTaxgus1S4TlwjcFg0Slj_VGOLdFwIDqvoSx_l9nxy7g1wUCBSUZhrTkl0kq_3bU8aJjQ-Fkvj-gbw0TVXmTJeCE0pOyAtFjvhtUOmRdPI7rBsfhnirSuTaGZ1Q3qwn_VeTsxT1BCyCiRoER1TCyBwXiZpro6AfjxkcVOmr5d8NypakTLORsMUHR20kVyvmzmVudvzwQq36m_62DEU1gquptfU8BtjN8xEFD2qUNSsLuwg3twz0FWvMgNq0YPIrg4z3lmNGi1PLc6BaGvRACnO5Aj2zStmbaYpli3O1YRxoBz9AwyDZxPs4SnZJuIuiMAw9aIH6ySaxESdBENjzebvvPfgVwlpsnfzT5c6u_wOYQrB6)

# Spring's MVC
1. Spring uses servlets which run on the Tomcat server.
2. It follows the Model-View-Controller (MVC) design pattern.
3. Spring MVC provides a clear separation between the business logic, presentation logic, and navigation logic.
4. It supports various view technologies like JSP, Thymeleaf, and FreeMarker.
5. Spring MVC is highly configurable via XML or annotations.