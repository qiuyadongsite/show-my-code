package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/26 16:26
 * @Description:
 */
public class CyclicBarrierDemo extends Thread{
    static  CyclicBarrier cyclicBarrier=new CyclicBarrier(5);
    @Override
    public void run() {

        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-name:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            new CyclicBarrierDemo().start();
            new CyclicBarrierDemo().start();
            new CyclicBarrierDemo().start();
        }



    }
}
