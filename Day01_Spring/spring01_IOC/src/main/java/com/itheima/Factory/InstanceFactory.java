package com.itheima.Factory;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;

public class InstanceFactory {

    public UserService getBean() {
        System.out.println("实例化工厂创造对象");

        return new UserServiceImpl();
    }
}
