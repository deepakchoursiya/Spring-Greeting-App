package com.bridgelabz.GreetingAppDevelopment.repository;



import com.bridgelabz.GreetingAppDevelopment.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
