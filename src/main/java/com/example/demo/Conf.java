package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by Vasiliy Kylik (Lightning) on 22.02.2019.
 */
// Ни в коем случае не будем ставить @Configuration, потому что пропишем через spring.factories
    // потому что она подтянестя ослом вместе с другими
    @EnableConfigurationProperties(NotificationProp.class)
public class Conf {
    @Bean
    @Profile("PROD")// Этот Bean создаться только если конфигурация prod
    @ConditionalOnMissingBean(name = "prodNotificationListener") // здесь с маленькой буквы
    @ConditionalOnProperty(name = "prod.notification", matchIfMissing = true, havingValue = "true") // соответственно создавать, и если есть havingValue - true - то тоже создавать, если нет вообще - то тоже создавать надо
    public ProdNotificationListener listener(){
        return new ProdNotificationListener();
    }
}
