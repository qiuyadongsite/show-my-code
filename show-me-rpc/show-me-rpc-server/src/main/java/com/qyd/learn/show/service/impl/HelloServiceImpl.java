package com.qyd.learn.show.service.impl;

import com.qyd.learn.show.anon.MyRpcImpl;
import com.qyd.learn.show.domain.User;
import com.qyd.learn.show.service.IHelloService;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 09:27
 * @Description:
 */
@MyRpcImpl(IHelloService.class)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("sayHello接收到参数："+name);
        return "sayHello服务器返回："+name;
    }

    @Override
    public String saveUser(User user) {
        System.out.println("saveUser得到："+user);
        return "服务器saveUser";
    }
}
