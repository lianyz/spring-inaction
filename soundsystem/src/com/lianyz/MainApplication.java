package com.lianyz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();

        context.close();
    }
}
