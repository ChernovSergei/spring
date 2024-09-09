package ru.chernov.spring.java;

public class Computer {
    private int id;
    private MusicPlayerJ musicPlayerJ;

    public Computer(MusicPlayerJ musicPlayerJ) {
        id = 1;
        this.musicPlayerJ = musicPlayerJ;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayerJ.playMusic();
    }
}
