package com.lianyz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        Minstrel minstrel = new Minstrel(System.out);

        DamselRescuingKnight damselRescuingKnight = new DamselRescuingKnight(minstrel);
        damselRescuingKnight.embarkOnQuest();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        Knight knight = (Knight)context.getBean("knight");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        System.out.println();

        knight.embarkOnQuest();

        context.close();

        System.out.println("****************AnnotationConfigApplicationContext***************\n");

        AnnotationConfigApplicationContext configContext = new AnnotationConfigApplicationContext();
        configContext.register(KnightConfig.class);
        configContext.refresh();

        Knight knight2 = (Knight) configContext.getBean("knight");
        knight2.embarkOnQuest();
        configContext.close();
    }
}
