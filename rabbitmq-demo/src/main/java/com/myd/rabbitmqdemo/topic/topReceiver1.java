package com.myd.rabbitmqdemo.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class topReceiver1 {

    @RabbitHandler
    public void receiver(String contest){
        System.out.print("topic.message"+contest);
    }
}
