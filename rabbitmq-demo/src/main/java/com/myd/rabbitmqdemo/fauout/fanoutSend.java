package com.myd.rabbitmqdemo.fauout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class fanoutSend {

    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send(){
        amqpTemplate.convertAndSend("fanoutExchange","", "send");
    }
}
