package ru.chernov.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        /*MusicA music1 = context.getBean("musicBean", MusicA.class);
        MusicA music2 = context.getBean("jazzMusic", MusicA.class);

        MusicPlayerA player = new MusicPlayerA(music1);
        player.playMusic();

        player = new MusicPlayerA(music2);
        player.playMusic();*/

        //MusicPlayerA musicPlayerA = context.getBean("musicPlayerA", MusicPlayerA.class);

        //musicPlayerA.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());

        JazzMusic jazzMusic1 = context.getBean("jazzMusic", JazzMusic.class);
        JazzMusic jazzMusic2 = context.getBean("jazzMusic", JazzMusic.class);
        RapMusic rapMusic1 = context.getBean("rapMusic", RapMusic.class);
        RapMusic rapMusic2 = context.getBean("rapMusic", RapMusic.class);

        System.out.println();
        System.out.print("when prototype, the classes are different. The class pointers are equals = ");
        System.out.println(jazzMusic1 == jazzMusic2);

        System.out.print("when singleton, the classes are the same. The class pointers are equals = ");
        System.out.println(rapMusic1 == rapMusic2);
        context.close();
    }
}
