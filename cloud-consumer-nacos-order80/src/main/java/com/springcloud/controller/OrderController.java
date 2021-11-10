package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/7 21:52
 */
@RestController
public class OrderController {

    @Value("${server.port}")
    private String serverPort;

    @Value("${service-url.nacos-user-service}")
    private String PayMent_URL;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public String getPaymentId(@PathVariable("id") Long id){
        return restTemplate.getForObject(PayMent_URL+"/payment/get/"+id, String.class);
    }

}
