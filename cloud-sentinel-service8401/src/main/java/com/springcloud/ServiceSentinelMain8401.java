package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther wy
 * @create 2021/11/8 15:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceSentinelMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceSentinelMain8401.class, args);
    }
}
