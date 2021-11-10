package com.springcloud.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther wy
 * @create 2021/11/4 10:00
 */
@Component
@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT-SERVICE", fallback = PaymentHystrixServiceFallback.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id);

    @GetMapping("/payment/timeout/{id}")
    public String pamentInfo_timeOut(@PathVariable("id") Integer id);

}
