package com.itheima.service.impl;

import com.itheima.dao.GoodsDao;
import com.itheima.domain.Goods;
import com.itheima.service.GoodsService;

import java.util.List;

public class GoodsServiceImpl implements GoodsService {

    //TODO:setter方式注入GoodsDao
    private GoodsDao goodsDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public List<Goods> findList() {
        //TODO:调用GoodsDao的查询列表方法

        return goodsDao.queryList();
    }
}
