# ProductMicroservice
Task 1 for product microservice for Back end developer

1. You can clone it from github by running following command or you can download
  https://github.com/scardam144/ProductMicroservice.git
2. Import project into eclipse
  File -> Import -> Maven -> Existing Maven Projects -> Browse Project from cloned location
3. Right click on project in eclipse and then Maven -> Update Projects
4. Create sales schema into MySQL database
5. Update database credential and other configuration into application.properties available in src/main/java/resources

spring.datasource.url=jdbc:mysql://localhost:3306/sales
spring.datasource.username=root
spring.datasource.password=

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true


6. Right click on ProuctManagerApplication.java file and run as Java Application
Once Sprint Boot Application will be started successfully 


7.To get a home page, use following url and type in browser
  http://localhost:8080/home

