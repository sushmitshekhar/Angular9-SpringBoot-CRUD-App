package com.example.helloworld.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class HelloWorldController {

    @RequestMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World Sushmit";
    }
    @RequestMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello Sushmit Shekhar");
    }

}