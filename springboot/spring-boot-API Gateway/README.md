# API Gateway

What is API Gateway in microservice
   
   As a API Backend developer, we developed few services and now they are ready to consume.
   As a Front End developer, we consumer these services one by one as per direct API service URL. 
   Now issue here is, it is tightly dependent on services so if there is any change or refactoring in services, these changes needs to be made in FE code as well. 
   
   Below is issue - 
   
   ![Click Here](https://github.com/umeshwale/code-playarea/blob/master/springboot/spring-boot-API%20Gateway/Consumer%20Challenge.JPG)
   
   To resolve this issue we need to add one abstraction gateway which acts as fascade and just redirects requests as below - 
      
   ![Click Here](https://github.com/umeshwale/code-playarea/blob/master/springboot/spring-boot-API%20Gateway/API%20Gateway.JPG)
   
   And this abstraction layer is nothing but the API Gateway 
   
   ![Click](https://github.com/umeshwale/code-playarea/blob/master/springboot/spring-boot-API%20Gateway/API%20Gateway1.JPG)
   
   Now since we are using it as one point of entry for your services we will be able to take advantage of this to implement below - 
      - Security
      - Authentication 
      - CORS / CSRF 
      - Common configuration 


   But at the same time since it is single point of entry then it will be issue if this API gateway is down that means none of our services will be accessible, 
   so we need to add multiple API Gateways so as it will fault tolerent and then we need to add Load Balancer as below 
   
   ![Click](https://github.com/umeshwale/code-playarea/blob/master/springboot/spring-boot-API%20Gateway/API%20Gateway%20LoadBalancer.JPG)
      
      
