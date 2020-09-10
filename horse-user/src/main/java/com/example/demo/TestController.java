package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.bean.UserDTO;
import com.example.demo.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理测试")
@RestController
@AllArgsConstructor
public class TestController {

    private final ITestService testService;

//    @Autowired
//    StringRedisTemplate redisTemplate;

    @Autowired
    RedisTemplate<String, String> strRedisTemplate;
//
//    public TestController(ITestService testService) {
//        this.testService = testService;
//    }

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("com.example.demo");
//        context.refresh();
//        ITestService testService = context.getBean(ITestService.class);
//        System.out.printf(testService.getCustName());
//    }

    @ApiOperation("礼貌问候")
    @GetMapping("greet")
    public String greet(){
//        String greet = "hello";
//        return greet+" "+ testService.getCustName();
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("com.example.demo.service");
//        context.refresh();
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        ITestService testService = context.getBean(ITestService.class);
//        return testService.getCustName();
        strRedisTemplate.opsForValue().set("strKey", "你好啊李银河");
        System.out.println(strRedisTemplate.opsForValue().get("strKey"));
        String greet = strRedisTemplate.opsForValue().get("strKey");
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
    public List<UserDTO> qryAllUser(){
        return testService.qryUserList();
    }
}
