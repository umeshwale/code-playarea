# Building a RESTful Web Service

This is a sample hello world code as your sample first springboot application.

# What You Will Build
You will build a service that will accept HTTP GET requests at 

        http://localhost:8080/greeting.

It will respond with a JSON representation of a greeting, as the following listing shows:

        {"id":1,"content":"Hello, World!"}

You can customize the greeting with an optional name parameter in the query string, as the following listing shows:

        http://localhost:8080/greeting?name=User
        
The name parameter value overrides the default value of World and is reflected in the response.

# Steps followed to achieve this -
    1. Open Spring Initializr - https://start.spring.io/
    2. Add Spring Web dependency
    3. Generate project & open in Intellij
    4. Create RestController & model class 
    5. Build & Run SpringBootDemoApplication.java
    6. From Browser or Postman - http://localhost:8080/greeting?name=User


