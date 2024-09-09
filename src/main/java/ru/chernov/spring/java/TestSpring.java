package ru.chernov.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        TechnoMusic technoMusic = context.getBean("bean1", TechnoMusic.class);
        CountryMusic countryMusic = context.getBean("bean2", CountryMusic.class);
        MusicPlayerJ musicPlayerJ = context.getBean("bean3", MusicPlayerJ.class);
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(technoMusic.getSong());
        System.out.println(countryMusic.getSong());
        System.out.println(musicPlayerJ.playMusic());
        System.out.println(computer);
    }
}
