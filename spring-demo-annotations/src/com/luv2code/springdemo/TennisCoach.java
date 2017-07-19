package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Tippy on 7/4/2017.
 */

@Component
public class TennisCoach implements Coach {

    // auto wires using reflection (field level injection)
    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

    /*
    // autowiring setter injection
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        this.fortuneService = theFortuneService;
    }
    */

    /*
    // constructor injection
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
