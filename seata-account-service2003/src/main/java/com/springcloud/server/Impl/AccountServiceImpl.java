package com.springcloud.server.Impl;

import com.springcloud.dao.AccountDao;
import com.springcloud.server.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @auther wy
 * @create 2021/11/9 19:13
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        /*模拟超时异常*/
        try{
            TimeUnit.SECONDS.sleep(20);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
    }
}
