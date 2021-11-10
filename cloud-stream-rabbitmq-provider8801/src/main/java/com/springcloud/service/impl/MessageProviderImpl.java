package com.springcloud.service.impl;

import com.springcloud.service.ImessageProvider;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;


import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/**
 * @auther wy
 * @create 2021/11/6 13:15
 */
@EnableBinding(Source.class)        //定义生产者的消息推送管道  Source  消费者消息推送管道 sink
public class MessageProviderImpl implements ImessageProvider {

    @Resource
    private MessageChannel output;          //消息发送通道

    @Override

    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*******srial:"+serial);
        return serial;
    }
}
