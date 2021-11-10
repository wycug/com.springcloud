package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther wy
 * @create 2021/11/7 21:51
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain80.class, args);
    }

}
