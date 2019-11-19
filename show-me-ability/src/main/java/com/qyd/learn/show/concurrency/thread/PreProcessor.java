package com.qyd.learn.show.concurrency.thread;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 10:00
 * @Description:
 */
public class PreProcessor extends Thread implements RequestProceesor {

    private LinkedBlockingQueue<Request> requestList=new LinkedBlockingQueue<>();

    volatile boolean isFinished=false;

    RequestProceesor nextProceesor;

    public PreProcessor() {

    }

    public PreProcessor(RequestProceesor nextProceesor) {
        this.nextProceesor=nextProceesor;
    }

    @Override
    public void process(Request request) {
        requestList.add(request);

    }

    @Override
    public void run() {
        while (!isFinished){
            Request take = null;
            try {
                take = requestList.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("preProcessor 处理："+take.getName());
            nextProceesor.process(take);
        }
    }
}
