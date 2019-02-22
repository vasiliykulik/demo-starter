package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.02.2019.
 */

@Data
// Что бы не надо было геттеры сеттеры ставить
@ConfigurationProperties(prefix = "prod")
// Видите лампочка закорелась
/* в dependency подтянем spring-boot-configuration-processor Эта штука просто на этапе maven install умеет генерить этот json файл из которого это все будет подтягиваться и это properties будут комплитится и не только в application.properties, но и вообще в других местах тоже*/
public class NotificationProp {
    private List<String> mails; // нам нужна автоконфигурация, которая продекларирует листенера, которая по рефрешу контекста

}
