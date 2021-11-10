package com.springcloud.controller;

import com.springcloud.service.ImessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther wy
 * @create 2021/11/6 14:01
 */

@RestController
public class SendMessageController {

    @Resource
    private ImessageProvider imessageProvider;

    @GetMapping("/sendMessage")

    public String sendMessage(){
        return imessageProvider.send();
    }
}
