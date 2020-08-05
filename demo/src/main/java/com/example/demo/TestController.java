package com.example.demo;

import com.example.demo.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理")
@RestController
public class TestController {

//    private final ITestService testService;
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
        String greet = "hello";
//        return greet+" "+ testService.getCustName();
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.scan("com.example.demo.service");
//        context.refresh();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ITestService testService = context.getBean(ITestService.class);
        return testService.getCustName();
    }
}
