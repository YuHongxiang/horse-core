package com.mycompany.app.service.impl;

import com.mycompany.app.bean.User;

import java.util.List;

public interface IUserService {
    String getCustName();

    String findUserNameById(Long userId);

    User findUserById(Long userId);

    List<User> qryUserList();
}
