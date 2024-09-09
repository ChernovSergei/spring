package ru.chernov.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.chernov.spring.java")
@PropertySource("classpath:musicPlayer2.properties")
public class SpringConfig {
    @Bean
    public TechnoMusic bean1() {
        return new TechnoMusic();
    }

    @Bean
    public CountryMusic bean2() {
        return new CountryMusic();
    }

    @Bean
    public FalkMusic falkMusic() {
        return new FalkMusic();
    }

    @Bean
    public MusicTypes musicTypes() {
        List<MusicJ> musicJList = new ArrayList<>();
        musicJList.add(bean1());
        musicJList.add(bean2());
        musicJList.add(falkMusic());
        return new MusicTypes(musicJList);
    }

    @Bean
    public MusicPlayerJ bean3() {
        return new MusicPlayerJ(musicTypes().getMusicJList());
    }

    @Bean
    public Computer computer() {
        return new Computer(bean3());
    }
}
