package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {
    private JazzMusic jazzMusic;
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayerA(JazzMusic jazzMusic, RapMusic rapMusic) {
        this.jazzMusic = jazzMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic() {
        System.out.println("Playing " + jazzMusic.getSong());
        System.out.println("Reading " + rapMusic.getSong());
    }
}
