package com.example.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Vasiliy Kylik (Lightning) on 05.02.2019.
 */
public class ProfileSentinelApplicationInitializer implements ApplicationContextInitializer{

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        // берем у Environment
        if(applicationContext.getEnvironment().getActiveProfiles().length == 0){
            throw new IllegalStateException(" без профиля нельзя !!!");
            // после этого прописать в spring.factories
        }
    }
}
