package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/22 10:12
 * @Description:
 */
public class LockDemo {

    static Lock lock=new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();

        Condition condition =
                lock.newCondition();
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CyclicBarrier cyclicBarrier=new CyclicBarrier(3);
        CountDownLatch countDownLatch=new CountDownLatch(2);
        Semaphore semaphore=new Semaphore(5);


        lock.unlock();
    }


}
