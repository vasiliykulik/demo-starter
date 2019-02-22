package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by Vasiliy Kylik (Lightning) on 22.02.2019.
 */
// Ни в коем случае не будем ставить @Configuration, потому что пропишем через spring.factories
    // потому что она подтянестя ослом вместе с другими
public class Conf {
    @Bean
    @Profile("PROD")// Этот Bean создаться только если конфигурация prod
    public ProdNotificationListener listener(){
        return new ProdNotificationListener();
    }
}
