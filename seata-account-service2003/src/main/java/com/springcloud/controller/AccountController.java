package com.springcloud.controller;

import com.springcloud.domain.CommonResult;
import com.springcloud.server.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @auther wy
 * @create 2021/11/9 19:15
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,
                          @RequestParam("money") BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣款成功");
    }

}
