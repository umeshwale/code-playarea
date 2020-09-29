# Caching Data with Spring

What is caching:

    Caching is a mechanism to enhance the performance of a system. 
    It is a temporary memory that lies between the application and the persistent database. 
    Cache memory stores recently used data items in order to reduce the number of database hits as much as possible.
    
Spring boot cache annotations:

    Spring framework provides cache abstraction api for different cache providers. 
    The usage of the API is very simple, yet very powerful. 
    
@EnableCaching:
    
    It enables Spring’s annotation-driven cache management capability. 
    In spring boot project, we need to add it to the boot application class annotated with @SpringBootApplication. 
    Spring provides one concurrent hashmap as default cache, but we can override CacheManager to register external cache 
    providers as well easily.    
    
    @SpringBootApplication
    @EnableCaching
    public class SpringBootCacheApplication {
    }
    
@Cacheable:

    It is used on the method level to let spring know that the response of the method are cacheable.
    Spring manages the request/response of this method to the cache specified in annotation attribute. 
    For example, @Cacheable ("cache-name1", “cache-name2”).
    
    @Cacheable annotation has more options. 
    Like we can specify the key of the cache from the request of the method. 
    If nothing specified, spring uses all the class fields and use those as cache key (mostly HashCode) to maintain caching but 
    we can override this behavior by providing key information.
    
    @GetMapping
    @Cacheable(value = "allEmployee")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        
    @GetMapping("/{id}")
    @CachePut(value = "employeeID", key = "#id")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) throws Exception {
    
    We can also use conditional caching as well. For example,
    
    @Cacheable(value="book", condition="#name.length < 50")
    public Book findStoryBook (String name)
    
@CachePut:
    
    Sometimes we need to manipulate the cacheing manually to put (update) cache before method call. 
    This will allow us to update the cache and will also allow the method to be executed. 
    The method will always be executed and its result placed into the cache (according to the @CachePut options).
    
    It supports the same options as @Cacheable and should be used for cache population rather then method flow optimization.
    
@CacheEvict:
    
    It is used when we need to evict (remove) the cache previously loaded of master data. 
    When CacheEvict annotated methods will be executed, it will clear the cache.
    
    We can specify key here to remove cache, if we need to remove all the entries of the cache then we need to use allEntries=true.
    This option comes in handy when an entire cache region needs to be cleared out – rather then evicting each entry (which would 
    take a long time since it is inefficient), all the entries are removed in one operation.
    
Maven Dependency:

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-cache</artifactId>
    </dependency>