package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerA {
    private MusicA music1;
    private MusicA music2;

    @Autowired
    public MusicPlayerA(@Qualifier("musicBean") MusicA music1, @Qualifier("jazzMusic") MusicA music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing " + music1.getSong() + " " + music2.getSong();
    }
}
