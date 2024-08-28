package ru.chernov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);

        player.playMusic();
        /**
         * At the background Spring do next:
         * 1. MusicPlayer musicPlayer1 = new MusicPlayer();
         * 2. musicPlayer1.setMusic(ClassicalMusic); //ClassicalMusic per applicationContext
         */

        System.out.println(player.getName());
        System.out.println(player.getVolume());

        System.out.println(player == player2);

        context.close();
    }
}
