package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/*
    响应json数据:
        方式一：将java对象转为json字符串 然后响应出去
        方式二：设置方法的返回值类型为java对象，在方法上打上@ResponseBody注解 此时SpringMVC就会将对象转为json数据响应给前端
            实现步骤：
                1.项目需要添加jackson-databind依赖
                2.开启MVC注解驱动
                3.设置方法返回值类型为对象，直接返回java对象即可
                4.在方法上打上@ResponseBody注解
   @ResponseBody:打在方法上
    作用：
        1.设置当前方法的返回值为响应体 无需解析
        2.将当前方法返回的java对象转为json格式数据 响应给前端
 */

@Controller
public class Controller02 {

    @RequestMapping("/page11")
    public void page11(HttpServletResponse response) throws IOException {
        System.out.println("page11....");

        //User -> json
        User user1 = new User("zhangsan", 18);
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(user1);

        response.getWriter().print(s);

    }

    //方式二
    //响应json对象
    @ResponseBody
    @RequestMapping(value = "/page12")
    public User page12() {

        System.out.println("page12...");

        User user2 = new User("Harry", 25);
        return user2;
    }

    //响应json对象数组
    @ResponseBody
    @RequestMapping(value = "/page13")
    public List<User> page13() {
        System.out.println("page13 ...");

        List<User> list = new ArrayList<>();
        User user1 = new User("Harry", 24);
        User user2 = new User("Tom", 17);
        User user3 = new User("Viper", 20);

        list.add(user1);
        list.add(user2);
        list.add(user3);

        return list;

    }



}
