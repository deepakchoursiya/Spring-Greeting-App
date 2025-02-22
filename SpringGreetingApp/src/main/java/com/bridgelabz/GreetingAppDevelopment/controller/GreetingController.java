package com.bridgelabz.GreetingAppDevelopment.controller;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET request to return a greeting message
    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello, Welcome to Greeting App!\"}";
    }

    // POST request to return a personalized greeting
    @PostMapping
    public String postGreeting(@RequestParam String name) {
        return "{\"message\": \"Hello, " + name + "! Welcome to Greeting App!\"}";
    }

    // PUT request to update a greeting message
    @PutMapping
    public String putGreeting(@RequestParam String name) {
        return "{\"message\": \"Greeting updated for " + name + "!\"}";
    }

    // DELETE request to delete a greeting
    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Greeting deleted successfully!\"}";
    }
}
