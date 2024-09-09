package ru.chernov.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class RapMusic implements MusicA {

    @PostConstruct
    public void doInit() {
        System.out.println("Initiate rap music class.");
    }

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

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroy rap music class.");
    }
}
