package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.bean.UserDTO;
import java.util.List;

public interface ITestService {
    String getCustName();

    String findUserNameById(Long userId);

    User findUserById(Long userId);

    List<UserDTO> qryUserList();
}
