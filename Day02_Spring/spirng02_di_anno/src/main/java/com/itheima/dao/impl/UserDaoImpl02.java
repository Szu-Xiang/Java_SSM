package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl02 implements UserDao {
    @Override
    public void add() {
        System.out.println("我是UserDaoImpl02的add方法");
    }
}
