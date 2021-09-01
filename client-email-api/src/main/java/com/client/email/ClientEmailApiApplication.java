package com.client.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientEmailApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientEmailApiApplication.class, args);
    }

}
