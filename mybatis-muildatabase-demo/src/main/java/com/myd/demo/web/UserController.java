package com.myd.demo.web;


import com.myd.demo.entity.UserEntity;
import com.myd.demo.mapper.test1.User1Mapper;
import com.myd.demo.mapper.test2.User2Mapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private User1Mapper user1Mapper;

    @Resource
    private User2Mapper user2Mapper;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users = user2Mapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user = user1Mapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        user1Mapper.insert(user);
    }

    @RequestMapping(value = "update")
    public void update(UserEntity user) {
        user1Mapper.update(user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }

}