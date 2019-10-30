package com.lianyz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.sound.midi.Track;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
