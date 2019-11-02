package com.lianyz.concertXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Drama drama = (Drama)context.getBean("drama");
        drama.perform();

        Encoreable encoreable = (Encoreable)drama;
        encoreable.performEncore();

        context.close();
    }
}
