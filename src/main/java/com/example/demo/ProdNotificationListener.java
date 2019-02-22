package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


/**
 * Created by Vasiliy Kylik (Lightning) on 16.02.2019.
 */
// Разсылать емейлы будет Listener
public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    // заинжекстим обычный бин
    @Autowired
    private NotificationProp notificationProp;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        notificationProp.getMails().forEach(System.out::println);
        // заинжектим мейл люде
    }
}
