package com.bridgelabz.GreetingAppDevelopment.service;


import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingService {

    // Method to generate greeting message based on input
    public Map<String, String> getGreetingMessage(String firstName, String lastName) {
        Map<String, String> response = new HashMap<>();

        if (firstName != null && lastName != null) {
            response.put("message", "Hello, " + firstName + " " + lastName + "!");
        } else if (firstName != null) {
            response.put("message", "Hello, " + firstName + "!");
        } else if (lastName != null) {
            response.put("message", "Hello, " + lastName + "!");
        } else {
            response.put("message", "Hello World!");
        }
        return response;
    }
}