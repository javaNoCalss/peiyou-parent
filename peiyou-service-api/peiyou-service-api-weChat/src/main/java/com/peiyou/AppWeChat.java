package com.peiyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppWeChat {

    public static void main(String[] args) {
        SpringApplication.run(AppWeChat.class, args);
    }
}
