package ru.chernov.spring.annotation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements MusicA {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("An jello bandalamenti");
        songs.add("Pink Panther");
        songs.add("Lilly was here");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
