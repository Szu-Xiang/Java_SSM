package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl02;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    @Value("Harry")
    private String name;
    @Value("USA")
    private String address;

    @Value("${jdbc.driverClass}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Override
    public void add() {
        System.out.println("调用了Service中的add方法");
        userDao.add();

        System.out.println("name = " + name);
        System.out.println("address = " + address);

        System.out.println("driverClass = " + driverClass);
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
