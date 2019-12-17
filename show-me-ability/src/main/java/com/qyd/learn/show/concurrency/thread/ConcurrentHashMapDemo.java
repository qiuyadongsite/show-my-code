package com.qyd.learn.show.concurrency.thread;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/26 18:12
 * @Description:
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
    /*   ConcurrentHashMap map=new ConcurrentHashMap();
        map.put("123","345");
        map.put("123","222");
        System.out.println(map.put("123","null"));*/

        ;
       HashMap m=new HashMap();
        m.put("12",null);
        System.out.println(m.get("12"));
    }
}
