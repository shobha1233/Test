package org.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
#commit 
@RestController
public class Restproject {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Received request on /hello endpoint");
        return "Hello from Spring Boot REST!";
    }
}
