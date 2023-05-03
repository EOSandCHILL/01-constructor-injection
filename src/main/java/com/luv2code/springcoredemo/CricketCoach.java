package com.luv2code.springcoredemo;
import org.springframework.stereotype.Component;

@Component // Marks the class as a spring bean which means it's now available for dependency injection.
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your free throws for 15 minutes";
    }
}