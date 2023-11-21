package org.example;

import org.springframework.stereotype.Component;

//@Component("repMusic")
public class RepMusic implements Music{
    @Override
    public String getSong() {
        return "Eminem";
    }
}