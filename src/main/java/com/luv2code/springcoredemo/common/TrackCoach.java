package com.luv2code.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component // Marks the class as a spring bean which means it's now available for dependency injection.
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your sprints for 15 minutes!";
    }
}