package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther wy
 * @create 2021/11/5 21:22
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigCenterMain3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3366.class, args);
    }
}
