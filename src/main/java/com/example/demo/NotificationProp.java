package com.example.demo;

import lombok.Data;

import java.util.List;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.02.2019.
 */

@Data // Что бы не надо .skj геттеры сеттеры ставить
public class NotificationProp {
    private List<String> mails;
}
