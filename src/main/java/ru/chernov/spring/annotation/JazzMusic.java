package ru.chernov.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class JazzMusic implements MusicA {

    @PostConstruct
    public void doInit() {
        System.out.println("Initiate jazz music class.");
    }

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

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroy jazz music class.");
    }
}
