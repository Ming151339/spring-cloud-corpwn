package com.zhiyou100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppliction {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAppliction.class,args);
    }
}
