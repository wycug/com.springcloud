package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @auther wy
 * @create 2021/11/6 14:24
 */

@Component
@EnableBinding({Sink.class})
public class ReceiveMesssageListencerController {

    @Value("${server.port}")
    private String serverPort;


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者："+serverPort+"接受到消息->"+message.getPayload());
    }

}
