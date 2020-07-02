package com.helloapp.demo;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/hello")
public class HelloAppController {

    @RequestMapping(value = "")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + " !";
    }

}
