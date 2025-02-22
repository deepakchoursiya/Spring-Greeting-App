package com.bridgelabz.GreetingAppDevelopment.service;


//import org.springframework.stereotype.Service;
//import java.util.HashMap;
//import java.util.Map;
//
//@Service
//public class GreetingService {
//
//    // Method to generate greeting message based on input
//    public Map<String, String> getGreetingMessage(String firstName, String lastName) {
//        Map<String, String> response = new HashMap<>();
//
//        if (firstName != null && lastName != null) {
//            response.put("message", "Hello, " + firstName + " " + lastName + "!");
//        } else if (firstName != null) {
//            response.put("message", "Hello, " + firstName + "!");
//        } else if (lastName != null) {
//            response.put("message", "Hello, " + lastName + "!");
//        } else {
//            response.put("message", "Hello World!");
//        }
//        return response;
//    }
//}



import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
import com.bridgelabz.GreetingAppDevelopment.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    // Constructor-based Dependency Injection
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Generate greeting message based on user input
    public Map<String, String> createGreeting(String firstName, String lastName) {
        String message;
        if (firstName != null && lastName != null) {
            message = "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            message = "Hello, " + firstName + "!";
        } else if (lastName != null) {
            message = "Hello, " + lastName + "!";
        } else {
            message = "Hello World!";
        }

        // Save message to database
        Greeting greeting = new Greeting(message);
        greetingRepository.save(greeting);

        // Prepare response
        Map<String, String> response = new HashMap<>();
        response.put("message", message);
        return response;
    }

    // Retrieve all saved greeting messages
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
}
