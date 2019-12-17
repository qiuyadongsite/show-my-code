package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/26 18:01
 * @Description:
 */
public class JointDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println(1);
        });
        Thread t2=new Thread(()->{
            System.out.println(2);
        });
        Thread t3=new Thread(()->{
            System.out.println(3);
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
