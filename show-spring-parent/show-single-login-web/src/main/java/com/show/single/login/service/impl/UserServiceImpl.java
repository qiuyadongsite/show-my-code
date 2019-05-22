package com.show.single.login.service.impl;

import com.show.single.login.dao.UserMapper;
import com.show.single.login.entity.RequestLoginObj;
import com.show.single.login.entity.UserLoginResponse;
import com.show.single.login.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:25
 * @Description:
 */
public class UserServiceImpl implements IUserService {


    private UserMapper userMapper;

    @Override
    public UserLoginResponse login(RequestLoginObj requestLoginObj) {
        return null;
    }
}
