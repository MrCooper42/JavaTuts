package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Tippy on 7/4/2017.
 */
public class HockeyJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeSportConfig.class);

        // get the bean from the spring container
        Coach theCoach = context.getBean("hockeyCoach", HockeyCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close context
        context.close();

    }
}