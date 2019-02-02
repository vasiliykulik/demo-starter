package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by Vasiliy Kylik (Lightning) on 05.01.2019.
 */
public class DevProfileResolverEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
        if (configurableEnvironment.getActiveProfiles().length == 0) {
            if (System.getenv().get("OS").contains("Windows")) {
                configurableEnvironment.addActiveProfile("DEV");
            }
        }
    }
}
