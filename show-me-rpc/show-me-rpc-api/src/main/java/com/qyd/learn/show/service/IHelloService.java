package com.qyd.learn.show.service;

import com.qyd.learn.show.domain.User;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 09:21
 * @Description:
 */
public interface IHelloService {
    public String sayHello(String name);

    public String saveUser(User user);
}
