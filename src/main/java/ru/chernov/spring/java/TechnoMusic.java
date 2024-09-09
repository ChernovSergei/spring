package ru.chernov.spring.java;

import org.springframework.stereotype.Component;

@Component
public class TechnoMusic implements  MusicJ {

    @Override
    public String getSong() {
        return "play techno music";
    }
}
