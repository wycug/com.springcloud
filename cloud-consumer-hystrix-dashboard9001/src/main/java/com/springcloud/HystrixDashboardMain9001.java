package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @auther wy
 * @create 2021/11/4 14:42
 */

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
//    http://localhost:9001/hystrix
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
