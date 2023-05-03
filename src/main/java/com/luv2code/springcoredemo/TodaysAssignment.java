package com.luv2code.springcoredemo;
import org.springframework.stereotype.Component;

@Component // Marks the class as a spring bean which means it's now available for dependency injection.
public class TodaysAssignment implements Professor {

    @Override
    public String getClassAssignment() {
        return "Today's assignment requires you to build a machine learning model";
    }
}
