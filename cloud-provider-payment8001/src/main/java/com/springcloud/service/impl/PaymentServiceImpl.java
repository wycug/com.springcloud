package com.springcloud.service.impl;

import com.springcloud.entities.Payment;
import com.springcloud.dao.PaymentDao;
import com.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

//    @Autowired
    @Resource  //等于Autowired（spring） Resource(javax)
    private PaymentDao paymentDao;


    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);

    }
}
