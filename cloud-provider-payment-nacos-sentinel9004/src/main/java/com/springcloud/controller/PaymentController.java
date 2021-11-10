package com.springcloud.controller;

import com.springcloud.dao.PaymentDao;
import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/8 17:00
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentDao paymentDao;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getpaymentById(@PathVariable("id") Long id){
        Payment payment = paymentDao.getPaymentById(id);
        CommonResult<Payment> result = new CommonResult<>(200, "from port:"+serverPort, payment);
        return result;
    }


}
