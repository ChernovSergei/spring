package ru.chernov.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {
    private JazzMusic music;

    public MusicPlayerA(JazzMusic music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
