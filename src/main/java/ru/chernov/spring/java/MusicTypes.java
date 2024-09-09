package ru.chernov.spring.java;

import java.util.ArrayList;
import java.util.List;

public class MusicTypes {
    private List<MusicJ> musicJList = new ArrayList<>();

    public MusicTypes(List<MusicJ> musicJList) {
        this.musicJList = musicJList;
    }

    public List<MusicJ> getMusicJList() {
        return musicJList;
    }
}
