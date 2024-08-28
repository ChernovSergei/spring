package ru.chernov.spring.xml;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Classical music";
    }

    public void doMyInit() {
        System.out.println("classic music initiation");
    }

    public void doMyDestroy() {
        System.out.println("classic music destruction");
    }
}
