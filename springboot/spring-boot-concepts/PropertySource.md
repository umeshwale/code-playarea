# @PropertySource

 @PropertySource annotation to externalize your configuration to a properties file. 
 
    @RestController
    @PropertySource(value = "classpath:propertyresource.properties")
    public class PropertyResourceAnnotationExampleController {
    
        @Value("${greeting}")
        String greetingMessage;
    
        @GetMapping("/greeting")
        public String greeting() {
            return greetingMessage;
        }
    }
    