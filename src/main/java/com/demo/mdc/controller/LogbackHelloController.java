//package com.demo.mdc.controller;
//
//import com.demo.mdc.common.Constants;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.MDC;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.UUID;
//
//@RestController
//public class LogbackHelloController {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackHelloController.class);
//
//    @GetMapping("/logback/hello/{name}")
//    public String hello(@PathVariable("name") String name) {
//        String uuid = UUID.randomUUID().toString();
//        MDC.put(Constants.REQUEST_ID, uuid);
//
//        LOGGER.info("Calling hello with parameter: " + name);
//        String result = "Hello " + name;
//        LOGGER.info("Response: " + result);
//
//        MDC.remove(Constants.REQUEST_ID);
//        return result;
//    }
//}
