package ru.chernov.spring.annotation;

public class MusicPlayerA {
    private MusicA music;

    public MusicPlayerA(MusicA music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
}
