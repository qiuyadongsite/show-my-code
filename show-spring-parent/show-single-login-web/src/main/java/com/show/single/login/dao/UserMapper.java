package com.show.single.login.dao;

import com.show.single.login.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:29
 * @Description:这里主要分析登录，mybaits以后再继承
 */
public class UserMapper {

    static Map<String,String> userMap=new HashMap();

    static {
        userMap.put("张三","1");
        userMap.put("李四","2");
    }

    public User getPasswordByName(String userName){
        return new User(userName,userName,userMap.get(userName));
    }
}
