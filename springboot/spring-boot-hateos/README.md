# Spring Boot HATEOS

HATEOAS is an acronym for Hypermedia As The Engine Of Application State. 
HAL – Hypertext Application Language


    Create Simple web project
        1. go to start.spring.io
        2. Add Web dependency & generate project
        3. Create Person (Age, First Name, Last Name) class & Rest controller (/hateos mapping)
        4. Start application & hit endpoint - http://localhost:8080/hateos & we will get below response
            
            {
              "age": 10,
              "firstName": "Johnny",
              "lastName": "Walker"
            }

What is Spring HATEOS:

        Spring HATEOAS provides some APIs to ease creating REST representations that follow the HATEOAS principle when working with 
        Spring and especially Spring MVC. 
        The core problem it tries to address is link creation and representation assembly.
        
Spring HATEOS Features:
        
        - Model classes for link, resource representation models
        - Link builder API to create links pointing to Spring MVC controller methods
        - Support for hypermedia formats like HAL
          
Add Spring HATEOS Support

    - Add HATEOS maven dependency
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-hateoas</artifactId>
        </dependency>          
            
    - Add RepresentationModel Support to model bean 
        To easily create hypermedia enriched representations, Spring HATEOAS provides a set of classes with RepresentationModel at their root. 
        It’s basically a container for a collection of Links and has convenient methods to add those to the model. 
        The models can later be rendered into various media type formats that will define how the hypermedia elements look in the representation. 
        
            class Person extends RepresentationModel<Person> {
                int age;
                String firstName;
                String lastName;
            }
        
    - Building links
        Now we need to build links
        Spring HATEOAS now provides a WebMvcLinkBuilder that lets you create links by pointing to controller classes. 
        The following example shows how to do so:
             Link selfLink = linkTo(SpringHateosRestController.class)
                            .withSelfRel();
    
    - We need to provide support by adding HATEOS addnotation to restcontroller
        @RestController
        @EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
        public class SpringHateosRestController {
    
    After these changes our new HATEOS response will be as below - 
        
        {
          "_embedded": {
            "personList": [
              {
                "age": 10,
                "firstName": "Johnny",
                "lastName": "Walker"
              }
            ]
          },
          "_links": {
            "self": {
              "href": "http://localhost:8080"
            }
          }
        } 
        
    
    
 