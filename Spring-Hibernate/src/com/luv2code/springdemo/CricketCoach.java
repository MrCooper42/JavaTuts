package com.luv2code.springdemo;

/**
 * Created by Tippy on 7/3/2017.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    // add new fields for emailAddress and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside setter method - setTeam");
        this.team = team;
    }

    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: Inside no-arg constructor");
    }

    // setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
