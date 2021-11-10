package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther wy
 * @create 2021/11/7 17:14
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNacosMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosMain9001.class, args);

    }

}
