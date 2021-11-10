package com.springcloud.service.Impl;

import com.springcloud.dao.OrderDao;
import com.springcloud.domain.Order;
import com.springcloud.service.AccountService;
import com.springcloud.service.OrderService;
import com.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/9 16:57
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "wy-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("-------------------开始新建订单——————————————————");
        orderDao.create(order);

        log.info("-------------------订单微服务修改库存——————————————————");
        storageService.decrease(order.getProductId(), order.getCount());

        log.info("-------------------账户微服务修改余额——————————————————");
        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("-------------------修改订单状态——————————————————");
        orderDao.update(order.getUserId(), 1);


    }
}
