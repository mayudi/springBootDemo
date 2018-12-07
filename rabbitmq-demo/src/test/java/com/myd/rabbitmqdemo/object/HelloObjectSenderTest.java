package com.myd.rabbitmqdemo.object;

import com.myd.rabbitmqdemo.Entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloObjectSenderTest {

    @Autowired
    private HelloObjectSender helloObjectSender;

    @Test
    public void helloObject() throws Exception {
        User user=new User();
        user.setAge("1");
        user.setName("mayudi");
        helloObjectSender.send(user);

    }
}