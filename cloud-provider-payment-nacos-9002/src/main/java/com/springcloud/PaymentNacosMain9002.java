package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther wy
 * @create 2021/11/7 22:11
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNacosMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosMain9002.class, args);
    }
}
