package com.myd.rabbitmqdemo.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class topSend {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send1(){
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.1","send1");
    }

    public void send2(){
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message","send2");
    }

    public void send3(){
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages","send3");
    }
}
