package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import java.util.List;

public interface ITestService {
    String getCustName();

    String findUserNameById(Long userId);

    UserDTO findUserById(Long userId);

    List<UserDTO> qryUserList();
}
