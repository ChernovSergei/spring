package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayerA musicPlayerA;

    @Autowired
    public Computer(MusicPlayerA musicPlayerA) {
        id = 1;
        this.musicPlayerA = musicPlayerA;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayerA.playMusic(MusicTypes.RAP);
    }
}
