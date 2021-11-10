package com.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/4 9:28
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;


    @GetMapping("/payment/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("result:" + result);
        return result;
    }

    @GetMapping("/payment/timeout/{id}")
    public String pamentInfo_timeOut(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_TimeOUt(id);
        log.info("****result:"+result);
        return result;
    }
    @GetMapping("/payment/cb/{id}")
    public String pamentInfo_circuitBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_CircuitBreaker(id);
        log.info("****result:"+result);
        return result;
    }

}
