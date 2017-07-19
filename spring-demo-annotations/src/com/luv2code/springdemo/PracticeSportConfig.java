package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tippy on 7/4/2017.
 */

@Configuration
public class PracticeSportConfig {

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach hockeyCoach() {
        HockeyCoach myHockeyCoach = new HockeyCoach(happyFortuneService());

        return myHockeyCoach;
    }
}
