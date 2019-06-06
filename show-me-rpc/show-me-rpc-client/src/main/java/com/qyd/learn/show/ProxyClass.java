package com.qyd.learn.show;

import java.lang.reflect.Proxy;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 13:51
 * @Description:
 */
public class ProxyClass {



    public  static Object  newInstance(ClassLoader loader,
                                       Class<?>[] interfaces, String localhost, int i,String className) {
        return Proxy.newProxyInstance(loader,interfaces,(new ClientHandler(localhost,i,className)));
    }
}
