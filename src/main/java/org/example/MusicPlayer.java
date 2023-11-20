package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    private int volume;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
    public void playMusic(){
//        for (Music a : musicList) {
            System.out.println("Playing: " + music.getSong());
//        }
    }
}