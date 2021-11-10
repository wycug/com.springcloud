package com.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @auther wy
 * @create 2021/11/8 16:41
 */
public class CustomerBlockHandler {


    public String handlerException1(String p1, String p2, BlockException exception){
        return "handlerException1";
    }
    public String handlerException2(String p1, String p2, BlockException exception){
        return "handlerException1";
    }
}
