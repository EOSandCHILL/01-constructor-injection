package com.luv2code.springcoredemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Handles the GET request for /dailyworkout
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    @Autowired // tells spring to inject a dependency. Allows Spring to resolve and inject collaborating beans into
    // our bean.
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout") // Ensures that HTTP GET requests to /dailyworkout are mapped to getDailyWorkout().
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
