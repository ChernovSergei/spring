package ru.chernov.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        TechnoMusic technoMusic = context.getBean("technoMusic", TechnoMusic.class);
        CountryMusic countryMusic = context.getBean("countryMusic", CountryMusic.class);
        MusicPlayerJ musicPlayerJ = context.getBean("musicPlayerJ", MusicPlayerJ.class);
        System.out.println(technoMusic.getSong());
        System.out.println(countryMusic.getSong());
        System.out.println(musicPlayerJ.playMusic());
    }
}
