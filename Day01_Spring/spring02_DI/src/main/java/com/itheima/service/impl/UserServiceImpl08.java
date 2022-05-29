package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl08 implements UserService {

    private String driverClass;
    private String url;
    private String username;
    private String password;

    public void setDriveClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void add() {
        System.out.println("重写了UserService中的add方法");

        System.out.println("driverClass = " + driverClass);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }


}
