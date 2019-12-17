package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: qiuyd
 * @Date: 2019/12/2 09:49
 * @Description:
 */
public class ExcutorDemo extends  Thread{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new ExcutorDemo());
        Future<?> submit = executorService.submit(new RunableDemo());



    }


    @Override
    public void run() {
        System.out.println("sfd");
    }
}
