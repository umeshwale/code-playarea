package com.example.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootLoggerController {
    Logger logger = LoggerFactory.getLogger(SpringBootLoggerController.class);

    @RequestMapping(value = "/log")
    public String getLogs() {
        logger.debug("DEBUG Logs");
        logger.trace("TRACE Logs");
        logger.info("INFO Logs");
        logger.error("ERROR Logs");
        logger.warn("WARN Logs");
        return "Logs will be displayed on console";
    }
}
