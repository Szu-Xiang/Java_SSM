package com.szu.service;

import com.szu.domain.Game;

import java.util.List;

public interface GameService {

    //列举所有
    List<Game> selectAll();

    //添加
    boolean saveGame(Game game);

    //删除
    boolean deleteById(Integer id);

    //修改
    boolean updateGame(Game game);
}
