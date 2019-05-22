package com.show.single.login.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:29
 * @Description:
 */
public class UserMapper {

    static Map<String,String> userMap=new HashMap();

    static {
        userMap.put("张三","1");
        userMap.put("李四","2");
    }


}
