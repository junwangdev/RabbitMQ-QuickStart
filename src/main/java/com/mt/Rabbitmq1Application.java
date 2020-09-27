package com.mt;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rabbitmq1Application {
    public static void main(String[] args) {
        SpringApplication.run(Rabbitmq1Application.class, args);
    }

}