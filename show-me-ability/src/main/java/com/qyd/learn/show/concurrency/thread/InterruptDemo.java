package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/20 13:54
 * @Description:
 */
public class InterruptDemo {
    private static int i=0;

    public static void main(String[] args) throws InterruptedException {
       /* Thread thread=new Thread(()->{
           while (!Thread.currentThread().isInterrupted()){
               i++;
           }
            System.out.println("i="+i);
        });*/
        Thread thread=new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
              try {
                    TimeUnit.SECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(1);
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);

        thread.interrupt();

        System.out.println("end:"+thread.isInterrupted());





    }

}
