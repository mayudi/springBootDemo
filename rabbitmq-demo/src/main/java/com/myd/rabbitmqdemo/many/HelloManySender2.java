package com.myd.rabbitmqdemo.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HelloManySender2 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "hello many2 " + i;
        System.out.println("manySender : " + context);
        //queues 必须一致
        this.rabbitTemplate.convertAndSend("manyhello", context);
    }
}
