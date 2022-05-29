package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {

    private String name;
    private String address;

    private UserDao userDao;

    //属性一定要提供set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("调用了UserServiceImpl中的add方法 " + "name: " + name + " address: " + address);
    }
}
