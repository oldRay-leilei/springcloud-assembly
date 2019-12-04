package com.bw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaServer3 {

    public static void main(String[] args) {
        SpringApplication.run(eurekaServer3.class);
    }
}
