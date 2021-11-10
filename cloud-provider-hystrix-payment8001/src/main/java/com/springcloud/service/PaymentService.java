package com.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @auther wy
 * @create 2021/11/4 9:21
 */

@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){
        return "线程池:" + Thread.currentThread().getName()+"paymentInfo_OK, id"+"\thhh";
    }


    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOUtHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_TimeOUt(Integer id){
        int timeNumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentinfo_Timeout,id"+id+"\t"+"耗时"+timeNumber+"秒";

    }


    public String paymentInfo_TimeOUtHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_TimeOUtHandler服务响应超时请稍后再试,id"+id+"\twwww";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_CircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //开启加速器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),  // 请求次数超过峰值，熔断器将会关闭服务
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //时间范围
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") //失败率达到多少后跳匝
    })
    public String paymentInfo_CircuitBreaker(Integer id){
        if(id<0){
            throw new NumberFormatException();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentinfo_Timeout,id"+id+"\t";

    }
    public String paymentInfo_CircuitBreaker_fallback(Integer id){
        return "发生熔断";
    }
}
