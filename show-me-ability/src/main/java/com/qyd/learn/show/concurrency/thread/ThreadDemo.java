package com.qyd.learn.show.concurrency.thread;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 09:50
 * @Description:
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("tt");
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

    }
}
