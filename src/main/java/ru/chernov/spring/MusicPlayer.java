package ru.chernov.spring;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    /**
    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    */

    public MusicPlayer() { }

    //setMusic - Spring understand setMusic as music. Therefore, we point music as name in applicationContext.xml
    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(music.getSong());
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
}
