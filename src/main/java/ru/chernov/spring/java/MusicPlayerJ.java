package ru.chernov.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MusicPlayerJ {
    private MusicJ music1;
    private MusicJ music2;

    public MusicPlayerJ(MusicJ music1, MusicJ music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing " + music1.getSong() + " " + music2.getSong();
    }
}
