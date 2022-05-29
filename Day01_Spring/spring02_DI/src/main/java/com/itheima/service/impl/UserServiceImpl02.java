package com.itheima.service.impl;

import com.itheima.service.UserService;

public class UserServiceImpl02 implements UserService {

    private String name;
    private String address;

    //属性一定要提供set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void add() {
        System.out.println("调用了UserServiceImpl中的add方法 " + "name: " + name + " address: " + address);
    }
}
