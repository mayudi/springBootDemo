package com.myd.rabbitmqdemo.cofig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue manyhelloQueue() {
        return new Queue("manyhello");
    }

    @Bean
    public Queue objecthelloQueue() {
        return new Queue("objecthello");
    }
}
