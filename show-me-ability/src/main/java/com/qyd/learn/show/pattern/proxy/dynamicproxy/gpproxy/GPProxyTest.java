package com.qyd.learn.show.pattern.proxy.dynamicproxy.gpproxy;

import com.qyd.learn.show.pattern.proxy.Person;
import com.qyd.learn.show.pattern.proxy.dynamicproxy.jdkproxy.Girl;

/**
 * qyd on 2019/3/10.
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
