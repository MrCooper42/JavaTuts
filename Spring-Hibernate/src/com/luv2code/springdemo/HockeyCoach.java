package com.luv2code.springdemo;

/**
 * Created by Tippy on 6/29/2017.
 */
public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 10 suicides and make 10 goals";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
