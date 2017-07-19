package com.luv2code.springdemo;

/**
 * Created by Tippy on 7/3/2017.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
