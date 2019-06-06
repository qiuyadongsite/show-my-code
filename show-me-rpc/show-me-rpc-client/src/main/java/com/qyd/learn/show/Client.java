package com.qyd.learn.show;


import com.qyd.learn.show.domain.User;
import com.qyd.learn.show.service.IHelloService;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) {


        IHelloService h= (IHelloService) Proxy.newProxyInstance(IHelloService.class.getClassLoader(),new Class[]{IHelloService.class},new ClientHandler("localhost",8080,IHelloService.class.getName()));

        String ret=h.sayHello("qiuyd!");

        System.out.println("客户端收到结果："+ret);

        User user=new User();
        user.setName("k");
        user.setSex("男");
        String s = h.saveUser(user);
        System.out.println("客户端收到结果："+s);


    }
}
