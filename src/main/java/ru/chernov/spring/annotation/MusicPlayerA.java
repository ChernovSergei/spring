package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {
    @Autowired
    @Qualifier("jazzMusic")
    private MusicA music;

    public String playMusic() {
        return "Playing " + music.getSong();
    }
}
