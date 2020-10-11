package com.example.springcloudhystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixDemoRestController {

    @RequestMapping("/hystrixdemo/{hystrixFlag}")
    @HystrixCommand(fallbackMethod = "getFallBackResponse")
    public String getLiveResult(@PathVariable(value = "hystrixFlag") boolean flag) throws Exception {
        if (flag) {
            return "This response is from Live Method";
        } else throw new Exception();
    }

    public String getFallBackResponse(@PathVariable(value = "hystrixFlag") boolean flag) throws Exception {
            return "This response is from Dummy FallBack Method";
    }
}
