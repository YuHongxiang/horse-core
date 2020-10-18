package com.mycompany.app.service.impl;

import com.mycompany.app.bean.User;
import com.mycompany.app.mapper.UserMapper;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Service;

@Service("testService")
//@Scope("prototype")
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

  //    private final UserTestMapper userTestMapper;

    private final UserMapper userMapper;

    @Override
    public String getCustName() {
        String custName = "libai";
        return custName;
    }

    @Override
    public String findUserNameById(Long userId) {
        String name = "cxk";
        return null;
    }

    @Override
    public User findUserById(Long userId) {
        User user = userMapper.getUserById(userId);
        return user;
    }

    @Override
    public List<User> qryUserList() {
        return null;
    }
}
