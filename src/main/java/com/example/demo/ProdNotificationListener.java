package com.example.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.02.2019.
 */
// Разсылать емейлы будет Listener
public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // заинжектим мейл людей
    }
}
