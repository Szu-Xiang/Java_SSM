package com.szu.service.impl;

import com.szu.domain.Game;
import com.szu.mapper.GameMapper;
import com.szu.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;

    @Override
    public List<Game> selectAll() {
        return gameMapper.selectAll();
    }

    @Override
    public boolean saveGame(Game game) {
        return gameMapper.saveGame(game);
    }

    @Override
    public boolean deleteById(Integer id) {
        return gameMapper.deleteById(id);
    }

    @Override
    public boolean updateGame(Game game) {
        return gameMapper.updateGame(game);
    }
}
