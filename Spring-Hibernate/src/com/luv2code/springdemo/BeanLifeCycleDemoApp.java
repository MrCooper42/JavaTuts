package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tippy on 7/3/2017.
 */
public class BeanLifeCycleDemoApp {

    public static void  main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
