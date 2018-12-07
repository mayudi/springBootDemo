package com.myd.rabbitmqdemo.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "manyhello")
public class HelloManyReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("manyReceiver  : " + hello);
    }
}
