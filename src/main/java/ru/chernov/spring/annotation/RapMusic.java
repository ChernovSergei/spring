package ru.chernov.spring.annotation;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements MusicA {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Eminem");
        songs.add("50 cents");
        songs.add("Snoop Dog");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
