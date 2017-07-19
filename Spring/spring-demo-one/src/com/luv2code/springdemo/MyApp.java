package com.luv2code.springdemo;

/**
 * Created by Tippy on 6/29/2017.
 */
public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
