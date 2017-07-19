package com.luv2code.springdemo;

/**
 * Created by Tippy on 6/29/2017.
 */
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
