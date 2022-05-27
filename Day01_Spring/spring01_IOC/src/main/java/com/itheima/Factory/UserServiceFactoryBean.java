package com.itheima.Factory;

import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserServiceFactoryBean implements FactoryBean<UserService> {


    //代替原始实例工厂中创建对象的方法
    @Override
    public UserService getObject() throws Exception {
        System.out.println("加强版的实例化工厂创造对象");
        return new UserServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
