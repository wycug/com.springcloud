package com.springcloud.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @auther wy
 * @create 2021/11/9 19:07
 */
public interface AccountDao {


    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
