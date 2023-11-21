package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer musicPlayer;
    private int id = 1;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String toString() {
        return "Компьютер " + id + musicPlayer.playMusic();
    }
}
