package com.itheima.service.impl;

import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {

    //无参构造方法，如果不存在则在测试中会出现异常
    public UserServiceImpl(){
        System.out.println("无参构造方法被调用...");
    }

    @Override
    public void add() {
        System.out.println("调用了add方法...");
    }
}
