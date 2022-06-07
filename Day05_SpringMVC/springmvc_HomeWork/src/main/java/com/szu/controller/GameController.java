package com.szu.controller;

import com.szu.domain.Code;
import com.szu.domain.Game;
import com.szu.domain.Result;
import com.szu.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    /**
     * 查询所有数据
     * @return
     */
    //@ResponseBody
    @GetMapping
    public Result findAll() {

        List<Game> list = gameService.selectAll();
        if (list != null && list.size() > 0) {
            return new Result(Code.GET_OK, "查询成功", list);
        }
        return new Result(Code.GET_ERR, "查询失败", null);
    }

    /**
     * 上传图片
     * @param file 文件
     * @param request 请求
     * @return 文件路径
     * @throws Exception 异常抛出
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile file, HttpServletRequest request) throws Exception{

        //1.获取项目根路径下 images的具体路径
        String path = request.getServletContext().getRealPath("/images");
        //2.获取文件的名称
        String fileName = file.getOriginalFilename();

        //3.将文件名使用UUID进行替换，避免出现重名导致的错误
        //3.1获取文件的后缀名
        String extName = fileName.substring(fileName.lastIndexOf("."));
        //3.2使用UUID生成新的文件名
        String newFileName = UUID.randomUUID() + extName;

        //4.将文件进行拷贝
        file.transferTo(new File(path + "/" + newFileName));
        //5.返回文件路径
        return new Result(Code.UPLOAD_OK, "文件上传成功", "images/" + newFileName);
    }

    /**
     * 新增
     * @param game 实体类对象
     * @return Result
     */
    @PostMapping
    public Result addGame(Game game) {
        boolean flag = gameService.saveGame(game);

        if (flag) {
            return new Result(Code.SAVE_OK, "新增游戏成功", null);
        }
        return new Result(Code.SAVE_ERR, "新增游戏失败", null);
    }

    /**
     * 修改游戏
     * @param game 实体类对象
     * @return Result
     */
    @PutMapping
    public Result updateGame(Game game) {
        boolean flag = gameService.updateGame(game);

        if (flag) {
            return new Result(Code.UPDATE_OK, "修改游戏成功", null);
        }
        return new Result(Code.UPDATE_ERR, "修改游戏失败", null);

    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {

        boolean flag = gameService.deleteById(id);

        if (flag) {
            return new Result(Code.DELETE_OK, "删除游戏成功", null);
        }
        return new Result(Code.DELETE_ERR, "删除游戏失败", null);
    }



}
