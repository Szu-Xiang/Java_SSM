package com.itheima.exception;

import com.itheima.bean.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

//表示对实现Rest风格的Controller类中的方法进行增
@Slf4j
@RestControllerAdvice
public class ProjectExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R doException(SQLIntegrityConstraintViolationException e) {

        log.info("【全局捕获异常: {}】", e.getMessage());

        //异常信息：Duplicate entry 'zhangsan' for key 'employee.idx_username'

        //按照异常信息切割出想要的信息： 用户名'zhangsan'
        String message = e.getMessage();
        String userName = message.split(" ")[2];

        //响应处理结果
        return R.error("用户名： " + userName + " 重复");

    }

    //捕获自定义CustomException异常 进行处理
    @ExceptionHandler(CustomException.class)
    public R doCustomException(CustomException e){
        log.error("【全局异常处理器捕获异常：{}】",e.getMessage());

        //响应结果
        return R.error(e.getMessage());
    }
}
