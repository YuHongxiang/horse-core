package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {


    private Long userId;

    private String userName;

    private String sex;

    private Long age;

}
