package com.lianyz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConcertConfig {

    @Bean
    public Concert concert(){
        return new Concert("music");
    }

    @Bean
    public Concert concert2() {
        return new Concert("dance");
    }

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public EncoreableIntroducer encoreableIntroducer() {
        return new EncoreableIntroducer();
    }

    @Bean
    public DefaultEncoreable defaultEncoreable() {
        return new DefaultEncoreable();
    }
}
