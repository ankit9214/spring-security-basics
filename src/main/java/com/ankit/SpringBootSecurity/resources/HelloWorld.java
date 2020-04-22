package com.ankit.SpringBootSecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String getHello(){
        return "<h1>Hello World!</h1>";
    }
}
