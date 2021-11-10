package com.springcloud.Service;

import org.springframework.stereotype.Component;

/**
 * @auther wy
 * @create 2021/11/4 11:10
 */

@Component
public class PaymentHystrixServiceFallback implements PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "payment服务器宕机";
    }

    @Override
    public String pamentInfo_timeOut(Integer id) {
        return "payment服务器宕机";
    }
}
