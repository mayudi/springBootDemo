package com.myd.rabbitmqdemo.topic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class topSendTest {

    @Autowired
    private topSend topSend;

    @Test
    public void send1() {
        topSend.send1();
    }

    @Test
    public void send2() {
        topSend.send2();
    }

    @Test
    public void send3() {
        topSend.send3();
    }
}