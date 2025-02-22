package com.bridgelabz.GreetingAppDevelopment.service;


import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingService {

    // Method to return a simple greeting message
    public Map<String, String> getGreetingMessage() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World");
        return response;
    }
}