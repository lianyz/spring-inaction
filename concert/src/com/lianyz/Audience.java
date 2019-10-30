package com.lianyz;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* com.lianyz.Performance.perform(..)) && bean(concert2)")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("execution(* com.lianyz.Performance.perform(..)) && bean(concert)")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("silencing cell phones and Taking seats");
            jp.proceed();
            System.out.println("CLAP!");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}
