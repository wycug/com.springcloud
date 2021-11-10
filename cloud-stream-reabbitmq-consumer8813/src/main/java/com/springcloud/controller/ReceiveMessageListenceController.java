package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @auther wy
 * @create 2021/11/6 14:36
 */

@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenceController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void getMessage(Message<String> message){
            System.out.println("消费者："+serverPort+"接受到消息->"+message.getPayload());

    }

}
