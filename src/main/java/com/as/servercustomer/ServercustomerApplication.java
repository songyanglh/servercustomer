package com.as.servercustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServercustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServercustomerApplication.class, args);
    }
}
