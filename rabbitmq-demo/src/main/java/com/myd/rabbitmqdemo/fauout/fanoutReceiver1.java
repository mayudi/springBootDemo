package com.myd.rabbitmqdemo.fauout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.A")
public class fanoutReceiver1 {

    @RabbitHandler
    public void receiver(String content){
        System.out.print("receiver1"+content);
    }
}
