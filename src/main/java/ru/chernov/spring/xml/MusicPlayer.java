package ru.chernov.spring.xml;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;

    /**
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    */

    public MusicPlayer() { }

    //setMusic - Spring understand setMusic as music. Therefore, we point music as name in applicationContextXML.xml
    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void playMusic() {
        music.forEach(s -> System.out.println(s.getSong()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void doMyInit() {
        System.out.println("player initiation");
    }

    public void doMyDestroy() {
        System.out.println("player destruction");
    }
}
