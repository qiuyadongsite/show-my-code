package com.qyd.learn.show.concurrency.thread;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 09:46
 * @Description:
 */
public class RunableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        new Thread(new RunableDemo()).start();

        new Thread(()->{
            System.out.println("test!");
        }).start();
    }
}
