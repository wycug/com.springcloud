package com.springcloud.server;

import java.math.BigDecimal;

/**
 * @auther wy
 * @create 2021/11/9 19:12
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
