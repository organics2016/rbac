package com.organics.service;

import com.organics.entity.User;
import com.organics.dto.UserDto;
import com.organics.tools.CodeUtils;

import java.util.UUID;

/**
 * Created by 王汗超 on 2017/5/4.
 */
public class UserService {


    public User createUser(UserDto dto) {

        User user = new User();

        // 1、初始化用户ID
        String userId = UUID.randomUUID().toString();

        // 2、初始化salt
        String salt = CodeUtils.getRandomString(6);

        // 3、初始化password
        String encryptPassword = CodeUtils.encoderByMd5(dto.getPassword() + salt);


        return user;
    }
}
