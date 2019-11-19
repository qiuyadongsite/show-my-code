package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 11:05
 * @Description:
 */
public class ThreadStatusDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {

                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                        Thread.interrupted();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        },"wait_sleep").start();

    }
}
