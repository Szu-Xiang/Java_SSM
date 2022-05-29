package com.itheima;

import com.itheima.dao.impl.UserDaoImpl02;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserServiceImpl {

    @Test
    public void testAdd() {
        //创建Spring工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //找工厂要对象
        UserService userService = context.getBean(UserService.class);

        //执行方法
        userService.add();
    }
}
