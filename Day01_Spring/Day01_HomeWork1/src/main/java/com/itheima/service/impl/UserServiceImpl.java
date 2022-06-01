package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {

    //TODO:setter方式注入UserDao
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findUser() {
        //TODO:调用UserDao方法查询用户信息

        return userDao.queryUser();
    }
}