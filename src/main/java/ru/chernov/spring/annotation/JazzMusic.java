package ru.chernov.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements MusicA {

    private JazzMusic() { }

    @Override
    public String getSong() {
        return "Jazz music";
    }
}
