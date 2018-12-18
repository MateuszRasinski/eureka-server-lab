package com.github.mateuszrasinski.microservices.udemy.eurekaserverlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerLabApplication.class, args);
    }

}

