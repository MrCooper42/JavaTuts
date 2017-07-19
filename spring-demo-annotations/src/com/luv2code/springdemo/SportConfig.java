package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Tippy on 7/4/2017.
 */

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // add support to resolve ${...} properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer
    propertySourcesPlaceHolderConfigurer() {

        return new PropertySourcesPlaceholderConfigurer();
    }

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
