package com.myd.rabbitmqdemo.object;

import com.myd.rabbitmqdemo.Entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloObjectSender  {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {

        //queues 必须一致
        this.rabbitTemplate.convertAndSend("objecthello", user);
    }
}
