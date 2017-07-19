package com.luv2code.springdemo;

/**
 * Created by Tippy on 7/4/2017.
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }

}
