package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.Semaphore;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/26 16:54
 * @Description:
 */
public class SemaphoreDemo extends Thread{

    static Semaphore semaphore=new Semaphore(5);

    @Override
    public void run() {

        try {
            semaphore.acquire();
            System.out.println("Thread :"+Thread.currentThread().getName()+":拿到令牌");
            Thread.sleep(2000);
            System.out.println("Thread :"+Thread.currentThread().getName()+":释放令牌");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new SemaphoreDemo().start();
        }
    }
}
