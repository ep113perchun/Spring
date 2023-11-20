package org.example;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class RockMusic implements Music{
    private static RockMusic fabricMethod () {
        return new RockMusic();
    }
    private void doMyInit() {
        System.out.println("start init");
    }
    private void doMyDestroy() {
        System.out.println("start destroy");
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
