# Controller Vs RestController

    - Whenever we use @Controller annotation we also need to use @ResponseBody annotation.
    -  @RestController annotation in order to simplify the creation of RESTful web services. 
        It's a convenient annotation that combines @Controller and @ResponseBody, which eliminates
        the need to annotate every request handling method of the controller class with the @ResponseBody annotation.
        
Spring MVC Controller Class

    @Controller
    @RequestMapping(value = "/mvccontroller")
    public class MVCController {
    
        @GetMapping(value = "/products")
        public @ResponseBody Product getProducts() {
            Product product = new Product("MVC Controller Product");
            return product;
        }
    
    }
    
    If we dont use @ResponseBody  annotation then it will throw below exception 
    
    2021-05-05 10:45:20.882 ERROR 12684 --- [nio-9090-exec-4] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Circular view path [products]: would dispatch back to the current handler URL [/products] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)] with root cause
    
    javax.servlet.ServletException: Circular view path [products]: would dispatch back to the current handler URL [/products] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
    	at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210) ~[spring-webmvc-5.3.6.jar:5.3.6]
    	at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148) ~[spring-webmvc-5.3.6.jar:5.3.6]
    	at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316) ~[spring-webmvc-5.3.6.jar:5.3.6]

Spring REST Controller Class

    @RestController
    @RequestMapping(value = "/restcontroller")
    public class SpringRestController {
    
        @GetMapping(value = "/products")
        public Product getProducts() {
            Product product = new Product("Rest Controller Product");
            return product;
        }
    }
    
    Here no need to define @ResponseBody annotation.
    
@ResponseBody

    @ResponseBody is a Spring annotation which binds a method return value to the web response body. 
    It is not interpreted as a view name. 
    It uses HTTP Message converters to convert the return value to HTTP response body, based on the 
    content-type in the request HTTP header.
    The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON 
    and passed back into the HttpResponse object.
    
    
