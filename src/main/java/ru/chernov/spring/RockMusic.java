package ru.chernov.spring;

public class RockMusic implements Music {

    private RockMusic() { }

    @Override
    public String getSong() {
        return "Rock music";
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }
}
