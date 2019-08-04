package com.qyd.learn.show.pattern.proxy.dbroute;

/**
 * qyd.
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
