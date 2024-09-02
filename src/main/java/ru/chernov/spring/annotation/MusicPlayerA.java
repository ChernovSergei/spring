package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {
    private MusicA music;

    public MusicPlayerA(MusicA music) {
        this.music = music;
    }

    public void setMusic(MusicA music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
