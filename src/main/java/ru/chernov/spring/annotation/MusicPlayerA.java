package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayerA {
    private JazzMusic jazzMusic;
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayerA(JazzMusic jazzMusic, RapMusic rapMusic) {
        this.jazzMusic = jazzMusic;
        this.rapMusic = rapMusic;
    }

    public String playMusic(MusicTypes musicType) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (musicType == MusicTypes.JAZZ) {
            return "Playing " + jazzMusic.getSong().get(randomNumber);
        }
        return "Playing " + rapMusic.getSong().get(randomNumber);
    }
}
