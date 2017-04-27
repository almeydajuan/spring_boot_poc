# spring_boot_poc

This is a proof of concept of Spring Boot framework.

This is a simple app which shows how simple is:

* Initialize an Spring environment
* Read a properties file
* Create an endpoint
* Manage dependency injection with annotations
* Choose between different environments by program arguments
* Use the @Configuration annotation to initialize beans
* Schedule a Job
* Web services with JAX-RX
* Document the API with swagger

How to run it:

* If you want to use production environment you should add -Dspring.profiles.active=production to the starter class, by default it runs in local environment
* Check localhost:8080/swagger-ui.html
