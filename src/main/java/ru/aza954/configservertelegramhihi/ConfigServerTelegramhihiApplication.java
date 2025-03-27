package ru.aza954.configservertelegramhihi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerTelegramhihiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerTelegramhihiApplication.class, args);
    }

}
