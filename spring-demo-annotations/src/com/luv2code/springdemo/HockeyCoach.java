package com.luv2code.springdemo;

/**
 * Created by Tippy on 7/4/2017.
 */
public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 10 suicides and make 100 goals";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
