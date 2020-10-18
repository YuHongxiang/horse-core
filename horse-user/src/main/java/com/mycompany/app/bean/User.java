package com.mycompany.app.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by sang on 2017/12/17.
 */
@Data
@NoArgsConstructor
public class User {
    private Long id;
    private String username;
    private String password;
    private String nickname;
    private boolean enabled;
    private List<Role> roles;
    private String email;
    private String userface;
    private Timestamp regTime;
    private Long userId;

    private String userName;

    private String sex;

    private Long age;

}
