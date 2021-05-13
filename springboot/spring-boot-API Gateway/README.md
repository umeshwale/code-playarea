# API Gateway

What is API Gateway in microservice
   
   As a API Backend developer, we developed few services and now they are ready to consume.
   As a Front End developer, we consumer these services one by one as per direct API service URL. 
   Now issue here is, it is tightly dependent on services so if there is any change or refactoring in services, these changes needs to be made in FE code as well. 
   
   Below is issue - 
   
   ![Click Here](https://github.com/umeshwale/code-playarea/blob/master/springboot/spring-boot-API%20Gateway/Consumer%20Challenge.JPG)
   
   To resolve this issue we need to add one abstraction gateway which acts as fascade and just redirects requests as below - 
      
   ![Click Here](https://github.com/umeshwale/code-playarea/blob/master/springboot/spring-boot-API%20Gateway/API%20Gateway.JPG)
   
