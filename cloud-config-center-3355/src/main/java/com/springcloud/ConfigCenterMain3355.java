package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther wy
 * @create 2021/11/4 22:20
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigCenterMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3355.class, args);
    }
}
