package com.springcloud.Service;

import com.springcloud.Service.Impl.PaymentFallbackService;
import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther wy
 * @create 2021/11/8 20:56
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getpaymentById(@PathVariable("id") Long id);
}
