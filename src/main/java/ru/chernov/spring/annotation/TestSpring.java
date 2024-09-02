package ru.chernov.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        /*MusicA music1 = context.getBean("musicBean", MusicA.class);
        MusicA music2 = context.getBean("jazzMusic", MusicA.class);

        MusicPlayerA player = new MusicPlayerA(music1);
        player.playMusic();

        player = new MusicPlayerA(music2);
        player.playMusic();*/

        MusicPlayerA musicPlayerA = context.getBean("musicPlayerA", MusicPlayerA.class);

        musicPlayerA.playMusic();

        context.close();
    }
}
