package com.itheima.test;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestAccountServiceImpl {

    @Test
    public void testAdd() {
        //创建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //找工厂要对象
        AccountService accountService = context.getBean(AccountService.class);

        //调用方法
        List<Account> list = accountService.selectAll();

        for (Account account : list) {
            System.out.println("account = " + account);
        }
    }

}
