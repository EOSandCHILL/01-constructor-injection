package com.luv2code.springcoredemo.rest;
import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Handles the GET request for /dailyworkout
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout") // Ensures that HTTP GET requests to /dailyworkout are mapped to getDailyWorkout().
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
