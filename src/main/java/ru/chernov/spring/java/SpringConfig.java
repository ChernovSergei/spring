package ru.chernov.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.chernov.spring.java")
@PropertySource("classpath:musicPlayer2.properties")
public class SpringConfig {
}
