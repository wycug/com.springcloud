package com.springcloud.contorler;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @auther wy
 * @create 2021/11/8 15:12
 */
@RestController
public class TestController {

    @GetMapping("/testA")
    public String testA(){
        return UUID.randomUUID()+"   "+"testA";
    }
    @GetMapping("/testB")
    public String testB(){
        return UUID.randomUUID()+"   "+"testB";
    }


    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "testHotkey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "deal_testHotKey error";
    }

}
