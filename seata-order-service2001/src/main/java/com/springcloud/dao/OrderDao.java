package com.springcloud.dao;

import com.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther wy
 * @create 2021/11/9 16:39
 */

@Mapper
public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态，从0改为1
    void update(@Param("userId") Long userId, @Param("status")Integer status);
}
