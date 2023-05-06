package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Handles the GET request for /todaysassignment
public class AssignmentController {

    // define a private field for the dependency
    private Professor myProfessor;

    // define a constructor for dependency injection
    @Autowired // tells spring to inject a dependency. Allows Spring to
    // resolve and inject collaborating beans into our bean.
    public AssignmentController(Professor theProfessor) {
        myProfessor = theProfessor;
    }

    @GetMapping("/todaysassignment") // Ensures that HTTP GET requests to
    // /todaysassignment are mapped to getTodaysAssignment().
    public String getMyProfessor() {
        return myProfessor.getClassAssignment();
    }
}
