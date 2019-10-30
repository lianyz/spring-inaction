package com.lianyz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class MainApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConcertConfig.class);
        context.refresh();

        Concert concert = (Concert)context.getBean("concert");
        concert.perform();

        Encoreable encoreable = (Encoreable)concert;
        encoreable.performEncore();;

        Concert concert2 = context.getBean("concert2", Concert.class);
        concert2.perform();

        Encoreable encoreable2 = (Encoreable)concert2;
        encoreable2.performEncore();

        context.close();
    }


}
