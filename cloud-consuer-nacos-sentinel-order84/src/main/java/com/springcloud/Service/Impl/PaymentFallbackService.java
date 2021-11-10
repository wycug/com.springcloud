package com.springcloud.Service.Impl;

import com.springcloud.Service.PaymentService;
import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @auther wy
 * @create 2021/11/8 21:00
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> getpaymentById(Long id) {
        return new CommonResult<>(4444, "服务降级，fallbackexction", new Payment(id,"异常"));
    }
}
