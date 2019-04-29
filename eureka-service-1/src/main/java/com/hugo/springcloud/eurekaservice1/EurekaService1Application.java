package com.hugo.springcloud.eurekaservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableDiscoveryClient
@EnableEurekaServer
@SpringBootApplication
public class EurekaService1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService1Application.class, args);
    }

}
