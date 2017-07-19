package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by Tippy on 7/4/2017.
 */

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}
