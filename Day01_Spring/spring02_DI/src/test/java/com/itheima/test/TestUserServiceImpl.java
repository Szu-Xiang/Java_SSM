package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserServiceImpl {

    @Test
    public void testAdd() {
        //创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //管工厂要对象
        UserService us2 = (UserService) context.getBean("us2");
        UserService us3 = (UserService) context.getBean("us3");
        //执行方法
        us2.add();
        us3.add();
    }

    @Test
    public void testAdd2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //管工厂要对象
        UserService us4 = (UserService) context.getBean("us4");

        //执行方法
        us4.add();
    }

    @Test
    public void textAdd08() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext08.xml");

        UserService us = (UserService) context.getBean("us");

        us.add();

    }
}
