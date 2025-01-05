package com.kaminsky.feignconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignConfigApplication.class, args);
    }

}
