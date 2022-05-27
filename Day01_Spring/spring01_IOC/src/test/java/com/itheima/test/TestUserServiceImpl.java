package com.itheima.test;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserServiceImpl {

    //需求：使用单元测试类充当表现层调用业务代码， 调用UserServiceImpl的add方法
    //1.获取UserServiceImpl类的对象
    //2.使用UserServiceImpl类的对象调用方法

    @Test
    public void testAdd() {

        //创建Spring工厂对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //找工厂要对象
        UserService us = (UserService) context.getBean("usf");
        UserService us1 = (UserService) context.getBean("usf");

        //默认为单例，若想改成非单例，需要重写isSingleton方法
        System.out.println("us = " + us);
        System.out.println("us1 = " + us1);

        //执行方法
        us.add();
    }
}
