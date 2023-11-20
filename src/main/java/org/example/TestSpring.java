package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        RepMusic repMusic = context.getBean("repMusic", RepMusic.class);

        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);
        musicPlayer.playMusic();

        MusicPlayer musicPlayer1 = new MusicPlayer(repMusic);
        musicPlayer1.playMusic();

        context.close();
    }
}
