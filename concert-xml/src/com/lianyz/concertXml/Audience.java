package com.lianyz.concertXml;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    public void takeSeats() {
        System.out.println("Taking seats");
    }

    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    public void watchPerformance(ProceedingJoinPoint jp) {
        try{
            System.out.println("watch Silencing cell phones");
            System.out.println("watch taking seats");
            jp.proceed();
            System.out.println("watch CLAP!");
        } catch(Throwable e) {
            System.out.println("watch Demanding a refund");
        }
    }
}
