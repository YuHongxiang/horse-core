package com.mycompany.app.mapper;

import com.mycompany.app.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserTestMapper {

    @Select("select user_name from demo_user where user_id = #{userId} ")
    String findUserNameById(@Param("userId") Long userId);

    @Select("select * from demo_user where user_id = #{userId} ")
    User findUserById(@Param("userId") Long userId);

    @Select("select * from demo_user")
    List<User> findAllUser();

}
