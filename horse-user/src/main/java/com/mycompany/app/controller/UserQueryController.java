package com.mycompany.app.controller;

import com.mycompany.app.bean.User;
import com.mycompany.app.service.impl.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户管理测试")
@RestController
@AllArgsConstructor
@RequestMapping(value = "horse/manager/user/query", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserQueryController {

    private final IUserService testService;

    @ApiOperation("礼貌问候")
    @GetMapping("greet")
    public String greet(){
        String greet = "hello";
        return greet;
    }

    @ApiOperation("根据id获取用户名称")
    @GetMapping("findUserNameById")
    public String findUserNameById(@RequestParam(name = "userId")Long userId){
        return testService.findUserNameById(userId);
    }

    @ApiOperation("根据id获取用户对象")
    @GetMapping("findUserById")
    public User findUserById(@RequestParam(name = "userId")Long userId){
        return testService.findUserById(userId);
    }

    @ApiOperation("获取全部用户对象")
    @GetMapping("qryAllUser")
    public List<User> qryAllUser(){
        return testService.qryUserList();
    }
}
