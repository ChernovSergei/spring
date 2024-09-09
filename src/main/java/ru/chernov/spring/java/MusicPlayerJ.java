package ru.chernov.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerJ {
    @Autowired
    @Qualifier("countryMusic")
    private MusicJ music1;
    @Autowired
    @Qualifier("technoMusic")
    private MusicJ music2;

    public MusicPlayerJ() { }

    public String playMusic() {
        return "Playing " + music1.getSong() + " " + music2.getSong();
    }
}
