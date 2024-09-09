package ru.chernov.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayerA {
    private MusicA music1;
    private MusicA music2;
    @Value("${musicPlayer2.name}")
    private String name;
    @Value("${musicPlayer2.volume}")
    private int volume;

    @Autowired
    public MusicPlayerA(@Qualifier("jazzMusic") MusicA music1, @Qualifier("rapMusic") MusicA music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicTypes musicType) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (musicType == MusicTypes.JAZZ) {
            return "Playing " + music1.getSong().get(randomNumber);
        }
        return "Playing " + music2.getSong().get(randomNumber);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
