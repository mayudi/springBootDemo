package com.myd.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;

    public UserEntity() {
        super();
    }

    public UserEntity(String userName, String passWord) {
        super();
        this.passWord = passWord;
        this.userName = userName;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "userName " + this.userName + ", pasword " + this.passWord;
    }

}