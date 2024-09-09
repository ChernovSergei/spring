package ru.chernov.spring.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayerJ {
    List<MusicJ> musicJList = new ArrayList<>();

    public MusicPlayerJ(List<MusicJ> list) {
        this.musicJList = list;
    }

    public String playMusic() {
        Random random = new Random();
        int songNumber = random.nextInt(3);
        return musicJList.get(songNumber).getSong();
    }
}
