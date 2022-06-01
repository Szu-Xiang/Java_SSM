package com.itheima.service.impl;

import com.itheima.dao.OrderDao;
import com.itheima.domain.Goods;
import com.itheima.domain.Order;
import com.itheima.domain.User;
import com.itheima.service.GoodsService;
import com.itheima.service.OrderService;
import com.itheima.service.UserService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    //TODO:setter方式注入OrderDao
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    //TODO:setter方式注入UserService
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    //TODO:setter方式注入GoodsService
    private GoodsService goodsService;

    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    public Order findById(Integer id) {
        //TODO:调用OrderDao方法，根据ID查询订单信息
        Order order = orderDao.queryById(id);

        //TODO:调用UserService方法查询订单所属用户信息，并将用户信息设置到Order对象中
        User user = userService.findUser();
        order.setUser(user);

        //TODO:调用GoodsService方法查询订单所包含的商品列表，并将商品列表设置到Order对象中
        List<Goods> list = goodsService.findList();
        order.setGoodsList(list);

        return order;
    }
}