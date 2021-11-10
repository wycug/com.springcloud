package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther wy
 * @create 2021/11/6 14:23
 */

@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8812 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8812.class, args);
    }

}
