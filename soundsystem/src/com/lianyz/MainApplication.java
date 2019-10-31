package com.lianyz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
        player.playTrack(0);

        CompactDisc disc = (CompactDisc) context.getBean("compactDisc");
        disc.playTrack(0);

        TrackCounter2 counter = context.getBean(TrackCounter2.class);
        System.out.println("TrackCounter2: " + counter.toString());

        context.close();
    }
}
