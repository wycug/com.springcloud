package com.springcloud.contorler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import com.springcloud.handler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther wy
 * @create 2021/11/8 16:25
 */

@RestController
public class RateLimitController {


    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handleException1")
    public CommonResult byResorce(){
        return new CommonResult(200, "按资源名称限流测试ok", new Payment(2000L,"serial001"));
    }

//    public CommonResult handleException(BlockException e){
//        return new CommonResult(444,  e.getClass().getCanonicalName()+"\t服务不可用");
//    }
}
