package org.example;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
