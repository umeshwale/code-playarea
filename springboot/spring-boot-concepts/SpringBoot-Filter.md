# Spring Boot - FIlter

    A filter is an object used to intercept the HTTP requests and responses of your application. 
    By using filter, we can perform two operations at two instances −
    
        1. Before sending the request to the controller
        2. Before sending a response to the client.
        
The following code shows the sample code for a Servlet Filter implementation class with @Component annotation.
        
    @Component
    public class SimpleFilter implements Filter {
        @Override
        public void doFilter(ServletRequest servletRequest,
                             ServletResponse servletResponse, FilterChain filterChain)
                throws IOException, ServletException {
    
            System.out.println("In the filter");
            filterChain.doFilter(servletRequest, servletResponse);
    
        }
    }
        
Below is a snippet logs where we can see sysout from filter is coming first than controller- 

    2021-05-05 17:53:23.212  INFO 14900 --- [nio-9090-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
    2021-05-05 17:53:23.213  INFO 14900 --- [nio-9090-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
    2021-05-05 17:53:23.213  INFO 14900 --- [nio-9090-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
    In the filter
    In restcontroller products