package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/26 16:51
 * @Description:
 */
public class CountDownLatchDemo {

    static CountDownLatch countDownLatch=new CountDownLatch(3);

    public static void main(String[] args) {

        new Thread(()->{
            System.out.println(1);
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            System.out.println(2);
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            System.out.println(3);
            countDownLatch.countDown();
        }).start();

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("123");
    }
}
