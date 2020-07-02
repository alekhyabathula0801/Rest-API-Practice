package com.helloapp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloAppController {

    @RequestMapping("hello")
    public String sayHello() {
        return "Hello World";
    }

}
