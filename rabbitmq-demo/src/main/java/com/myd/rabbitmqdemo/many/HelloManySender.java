package com.myd.rabbitmqdemo.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class HelloManySender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "hello many " + i;
        System.out.println("manySender : " + context);
        //queues 必须一致
        this.rabbitTemplate.convertAndSend("manyhello", context);
    }
}
