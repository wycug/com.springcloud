package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @auther wy
 * @create 2021/11/7 17:15
 */

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/get/{id}")
    public String getPaymentId(@PathVariable("id") Long id){
        String uuid = UUID.randomUUID().toString();
        return  serverPort+"  "+uuid+ "by id:"+id;
    }
}
