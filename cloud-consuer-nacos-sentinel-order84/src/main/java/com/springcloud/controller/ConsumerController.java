package com.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.Service.Impl.PaymentFallbackService;
import com.springcloud.Service.PaymentService;
import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

/**
 * @auther wy
 * @create 2021/11/8 17:09
 */
@RestController

public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String Payment_URL;

    @GetMapping("/consumer/payment/get/{id}")
    @SentinelResource(value = "fallback",
            fallback = "fallbackHandler",
            blockHandler = "blockHandler"
    )

    public CommonResult<Payment> getpaymentById(@PathVariable("id") Long id){
        CommonResult<Payment> result = restTemplate.getForObject(Payment_URL+"/payment/get/"+id, CommonResult.class);

        if(result.getData()==null){
            throw new NullPointerException("NullPointerException，没有对应的订单");
        }else if(id==5){
            throw new IllegalArgumentException("非法参数异常");
        }
        return result;
    }

    public static CommonResult blockHandler(@PathVariable Long id, BlockException blockException){
        Payment payment = new Payment(id, "null");
        return new CommonResult<>(445, "限流，blockexception"+ blockException.getMessage(), payment);
    }
    public static CommonResult<Payment> fallbackHandler(@PathVariable Long id, Throwable e){
        Payment payment = new Payment(id, "null");
        return new CommonResult<>(444,"handlerFallback, exception " +e.getMessage(), payment);
    }

    /*====================================openfeign*/

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/paymentF/get/{id}")
    public CommonResult testOpenFeign(@PathVariable("id") Long id){
        return paymentService.getpaymentById(id);
    }

}
