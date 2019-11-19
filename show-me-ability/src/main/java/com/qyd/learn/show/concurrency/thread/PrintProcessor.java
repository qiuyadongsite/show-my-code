package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 10:19
 * @Description:
 */
public class PrintProcessor extends Thread implements RequestProceesor {

    private LinkedBlockingQueue<Request> requestList=new LinkedBlockingQueue<>();

    volatile boolean isFinished=false;

    RequestProceesor nextProceesor;

    public PrintProcessor(RequestProceesor nextProceesor) {
        this.nextProceesor=nextProceesor;
    }

    public PrintProcessor() {
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
            System.out.println("PrintProcessor 处理："+take.getName());
            nextProceesor.process(take);
        }
    }
}
