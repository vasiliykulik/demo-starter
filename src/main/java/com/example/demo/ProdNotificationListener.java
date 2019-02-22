package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.02.2019.
 */
// Разсылать емейлы будет Listener
public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    // заинжекстим бин
    private NotificationProp notificationProp;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // заинжектим мейл люде
        notificationProp.getMails.forEach(System.out::println);
    }
}
