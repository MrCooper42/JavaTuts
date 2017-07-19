package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tippy on 7/4/2017.
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close context
        context.close();
    }
}
