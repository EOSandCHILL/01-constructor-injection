package com.luv2code.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component  // Marks the class as a spring bean which means it's now available for dependency injection.
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your cricketing for 15 minutes!";
    }
}
