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



//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.repository.GreetingRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    // Constructor-based Dependency Injection
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    // Generate greeting message based on user input
//    public Map<String, String> createGreeting(String firstName, String lastName) {
//        String message;
//        if (firstName != null && lastName != null) {
//            message = "Hello, " + firstName + " " + lastName + "!";
//        } else if (firstName != null) {
//            message = "Hello, " + firstName + "!";
//        } else if (lastName != null) {
//            message = "Hello, " + lastName + "!";
//        } else {
//            message = "Hello World!";
//        }
//
//        // Save message to database
//        Greeting greeting = new Greeting(message);
//        greetingRepository.save(greeting);
//
//        // Prepare response
//        Map<String, String> response = new HashMap<>();
//        response.put("message", message);
//        return response;
//    }
//
//    // Retrieve all saved greeting messages
//    public List<Greeting> getAllGreetings() {
//        return greetingRepository.findAll();
//    }
//}


//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.repository.GreetingRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    // Save a new greeting message
//    public Map<String, String> createGreeting(String firstName, String lastName) {
//        String message;
//        if (firstName != null && lastName != null) {
//            message = "Hello, " + firstName + " " + lastName + "!";
//        } else if (firstName != null) {
//            message = "Hello, " + firstName + "!";
//        } else if (lastName != null) {
//            message = "Hello, " + lastName + "!";
//        } else {
//            message = "Hello World!";
//        }
//
//        // Save message to database
//        Greeting greeting = new Greeting(message);
//        greetingRepository.save(greeting);
//
//        // Prepare response
//        Map<String, String> response = new HashMap<>();
//        response.put("message", message);
//        return response;
//    }
//
//    // Retrieve all stored greeting messages
//    public List<Greeting> getAllGreetings() {
//        return greetingRepository.findAll();
//    }
//
//    // Retrieve a greeting by ID
//    public Greeting getGreetingById(Long id) {
//        Optional<Greeting> greeting = greetingRepository.findById(id);
//        return greeting.orElse(null); // Return greeting if present, else return null
//    }
//}


//
//
//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.repository.GreetingRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    // Save a new greeting message
//    public Greeting createGreeting(String firstName, String lastName) {
//        String message;
//        if (firstName != null && lastName != null) {
//            message = "Hello, " + firstName + " " + lastName + "!";
//        } else if (firstName != null) {
//            message = "Hello, " + firstName + "!";
//        } else if (lastName != null) {
//            message = "Hello, " + lastName + "!";
//        } else {
//            message = "Hello World!";
//        }
//
//        // Save and return the greeting
//        return greetingRepository.save(new Greeting(message));
//    }
//
//    // Retrieve all stored greetings
//    public List<Greeting> getAllGreetings() {
//        return greetingRepository.findAll();
//    }
//}


//import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
//import com.bridgelabz.GreetingAppDevelopment.repository.GreetingRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class GreetingService {
//
//    private final GreetingRepository greetingRepository;
//
//    public GreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }
//
//    // Save a new greeting message
//    public Greeting createGreeting(String firstName, String lastName) {
//        String message;
//        if (firstName != null && lastName != null) {
//            message = "Hello, " + firstName + " " + lastName + "!";
//        } else if (firstName != null) {
//            message = "Hello, " + firstName + "!";
//        } else if (lastName != null) {
//            message = "Hello, " + lastName + "!";
//        } else {
//            message = "Hello World!";
//        }
//
//        return greetingRepository.save(new Greeting(message));
//    }
//
//    // Retrieve all stored greetings
//    public List<Greeting> getAllGreetings() {
//        return greetingRepository.findAll();
//    }
//
//    // Retrieve a greeting by ID
//    public Greeting getGreetingById(Long id) {
//        Optional<Greeting> greeting = greetingRepository.findById(id);
//        return greeting.orElse(null);
//    }
//
//    // Update a greeting message by ID
//    public Greeting updateGreeting(Long id, String newMessage) {
//        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
//        if (optionalGreeting.isPresent()) {
//            Greeting greeting = optionalGreeting.get();
//            greeting.setMessage(newMessage);
//            return greetingRepository.save(greeting);
//        }
//        return null; // Return null if greeting ID is not found
//    }
//}



import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
import com.bridgelabz.GreetingAppDevelopment.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Save a new greeting message
    public Greeting createGreeting(String firstName, String lastName) {
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
        return greetingRepository.save(new Greeting(message));
    }

    // Retrieve all stored greetings
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // Retrieve a greeting by ID
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    // Update a greeting message by ID
    public Greeting updateGreeting(Long id, String newMessage) {
        Optional<Greeting> optionalGreeting = greetingRepository.findById(id);
        if (optionalGreeting.isPresent()) {
            Greeting greeting = optionalGreeting.get();
            greeting.setMessage(newMessage);
            return greetingRepository.save(greeting);
        }
        return null; // Return null if the greeting ID is not found
    }

    // Delete a greeting message by ID
    public boolean deleteGreeting(Long id) {
        if (greetingRepository.existsById(id)) {
            greetingRepository.deleteById(id);
            return true;
        }
        return false; // Return false if greeting ID is not found
    }
}
