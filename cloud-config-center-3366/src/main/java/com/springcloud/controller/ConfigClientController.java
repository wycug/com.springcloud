package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther wy
 * @create 2021/11/4 22:21
 */
@RestController
@RefreshScope    //开启刷新
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/configinfo")
    public String getConfigInfo(){
        return  serverPort +"  :   "+configInfo;
    }
}
