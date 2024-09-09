package ru.chernov.spring.java;

import org.springframework.stereotype.Component;

public class CountryMusic implements MusicJ {

    @Override
    public String getSong() {
        return "play country music";
    }
}
