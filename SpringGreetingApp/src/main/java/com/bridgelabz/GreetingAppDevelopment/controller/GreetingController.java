package com.bridgelabz.GreetingAppDevelopment.controller;



//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    // GET request to return a greeting message
//    @GetMapping
//    public String getGreeting() {
//        return "{\"message\": \"Hello, Welcome to Greeting App!\"}";
//    }
//
//    // POST request to return a personalized greeting
//    @PostMapping
//    public String postGreeting(@RequestParam String name) {
//        return "{\"message\": \"Hello, " + name + "! Welcome to Greeting App!\"}";
//    }
//
//    // PUT request to update a greeting message
//    @PutMapping
//    public String putGreeting(@RequestParam String name) {
//        return "{\"message\": \"Greeting updated for " + name + "!\"}";
//    }
//
//    // DELETE request to delete a greeting
//    @DeleteMapping
//    public String deleteGreeting() {
//        return "{\"message\": \"Greeting deleted successfully!\"}";
//    }
//}




//import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    // Constructor-based Dependency Injection
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // GET request - Fetches greeting message from Service Layer
//    @GetMapping
//    public Map<String, String> getGreeting() {
//        return greetingService.getGreetingMessage();
//    }
//}
//import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    // Constructor-based Dependency Injection
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // GET request - Fetch greeting message with optional first & last name
//    @GetMapping
//    public Map<String, String> getGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName) {
//        return greetingService.getGreetingMessage(firstName, lastName);
//    }
//}



//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    // Constructor-based Dependency Injection
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // POST request - Create and save a greeting message
//    @PostMapping
//    public Map<String, String> createGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName) {
//        return greetingService.createGreeting(firstName, lastName);
//    }
//
//    // GET request - Retrieve all stored greeting messages
//    @GetMapping("/all")
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//}



//
//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // POST request - Create and save a greeting message
//    @PostMapping
//    public Map<String, String> createGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName) {
//        return greetingService.createGreeting(firstName, lastName);
//    }
//
//    // GET request - Retrieve all stored greeting messages
//    @GetMapping("/all")
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//
//    // GET request - Retrieve a greeting by ID
//    @GetMapping("/{id}")
//    public Greeting getGreetingById(@PathVariable Long id) {
//        return greetingService.getGreetingById(id);
//    }
//}


//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // POST request - Create and save a greeting message
//    @PostMapping
//    public Greeting createGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName) {
//        return greetingService.createGreeting(firstName, lastName);
//    }
//
//    // GET request - Retrieve all stored greetings
//    @GetMapping("/all")
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//}


//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingController {
//
//    private final GreetingService greetingService;
//
//    public GreetingController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }
//
//    // POST request - Create and save a greeting message
//    @PostMapping
//    public Greeting createGreeting(
//            @RequestParam(required = false) String firstName,
//            @RequestParam(required = false) String lastName) {
//        return greetingService.createGreeting(firstName, lastName);
//    }
//
//    // GET request - Retrieve all stored greetings
//    @GetMapping("/all")
//    public List<Greeting> getAllGreetings() {
//        return greetingService.getAllGreetings();
//    }
//
//    // GET request - Retrieve a greeting by ID
//    @GetMapping("/{id}")
//    public Greeting getGreetingById(@PathVariable Long id) {
//        return greetingService.getGreetingById(id);
//    }
//
//    // PUT request - Update a greeting message
//    @PutMapping("/{id}")
//    public Greeting updateGreeting(@PathVariable Long id, @RequestParam String message) {
//        return greetingService.updateGreeting(id, message);
//    }
//
//}




import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
import com.bridgelabz.GreetingAppDevelopment.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // POST request - Create and save a greeting message
    @PostMapping
    public Greeting createGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return greetingService.createGreeting(firstName, lastName);
    }

    // GET request - Retrieve all stored greetings
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    // GET request - Retrieve a greeting by ID
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    // PUT request - Update a greeting message
    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestParam String message) {
        return greetingService.updateGreeting(id, message);
    }

    // DELETE request - Delete a greeting message by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGreeting(@PathVariable Long id) {
        boolean isDeleted = greetingService.deleteGreeting(id);
        if (isDeleted) {
            return ResponseEntity.ok("Greeting with ID " + id + " deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Greeting with ID " + id + " not found.");
        }
    }
}
