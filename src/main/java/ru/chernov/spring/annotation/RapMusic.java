package ru.chernov.spring.annotation;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RapMusic implements MusicA {

    private RapMusic() { }

    @Override
    public String getSong() {
        return "Rap music";
    }
}
