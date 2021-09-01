package com.client.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.client.user.mapper")
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.client.email.service")
@EnableCircuitBreaker
public class ClientUserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUserApiApplication.class, args);
    }

}

