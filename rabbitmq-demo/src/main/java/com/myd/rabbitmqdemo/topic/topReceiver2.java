package com.myd.rabbitmqdemo.topic;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class topReceiver2 {

    @RabbitHandler
    public void receive(String contest){
        System.out.print("topic.messages"+contest);
    }
}
