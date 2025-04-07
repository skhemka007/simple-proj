package com.example.simple_proj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld 
{

    @GetMapping("/")
    public String hello() {
        System.out.println("Hello World!");
        return "Hello World!";
    }

}
