package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther wy
 * @create 2021/11/9 19:05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeataAcceountMain2003 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAcceountMain2003.class, args);
    }
}
