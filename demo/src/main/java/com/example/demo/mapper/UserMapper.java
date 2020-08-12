package com.example.demo.mapper;

import com.example.demo.dto.UserDTO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select user_name from demo_user where user_id = #{userId} ")
    String findUserNameById(@Param("userId") Long userId);

    @Select("select * from demo_user where user_id = #{userId} ")
    UserDTO findUserById(@Param("userId") Long userId);

    @Select("select * from demo_user")
    List<UserDTO> findAllUser();

}
