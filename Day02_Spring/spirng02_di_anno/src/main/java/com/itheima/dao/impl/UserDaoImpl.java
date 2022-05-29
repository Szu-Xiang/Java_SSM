package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("我是UserDaoImpl的add方法");
    }
}
