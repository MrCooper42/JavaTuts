package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Tippy on 7/4/2017.
 */
public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call ne swim coach methods ... has the props values injected from sport.properties file
        System.out.println("Email: " + theCoach.getEmail());

        System.out.println("Team: " + theCoach.getTeam());

        // close context
        context.close();
    }
}
