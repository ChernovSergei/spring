package ru.chernov.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
    public MusicPlayerJ bean3() {
        return new MusicPlayerJ(bean1(), bean2());
    }

    @Bean
    public Computer computer() {
        return new Computer(bean3());
    }
}
