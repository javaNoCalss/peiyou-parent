package com.peiyou;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2Doc
@EnableEurekaClient
public class AppBackend {

    public static void main(String[] args) {
        SpringApplication.run(AppBackend.class,args);
    }
}
