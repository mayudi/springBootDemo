package com.myd.rabbitmqdemo.object;

import com.myd.rabbitmqdemo.Entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "objecthello")
public class HelloObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        System.out.println("objectReceiver  : " + user.toString());
    }


}
