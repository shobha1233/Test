package org.example.test;

import org.springframework.web.bind.annotation.*;
//Test project 
@RestController
@RequestMapping("/api/users") // Base URL
    public class Restproject {
    // GET: /api/users/hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from REST API!";
    }

    // GET: /api/users/{id}
    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id) {
        return "User ID: " + id;
    }

    // POST: /api/users
    @PostMapping
    public String createUser(@RequestBody String user) {
        return "Created user: " + user;
    }
}
