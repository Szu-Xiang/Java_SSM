package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl02 implements UserDao {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add() {
        System.out.println("调用了UserServiceImpl的add方法...");
    }
}
