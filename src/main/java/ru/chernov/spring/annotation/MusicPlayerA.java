package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {
    @Autowired
    private MusicA music;

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
