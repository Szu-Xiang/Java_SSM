package com.szu.mapper;

import com.szu.domain.Game;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface GameMapper {

    @Select("select * from ssm_db.tb_game")
    List<Game> selectAll();

    @Insert("insert into ssm_db.tb_game values (null,#{name},#{type},#{url},#{ordered},#{company})")
    boolean saveGame(Game game);

    @Update("update ssm_db.tb_game set name = #{name},type=#{type},url=#{url},ordered=#{ordered},company=#{company} where id = #{id}")
    boolean updateGame(Game game);

    @Delete("delete from ssm_db.tb_game where id = #{id}")
    boolean deleteById(Integer id);
}
