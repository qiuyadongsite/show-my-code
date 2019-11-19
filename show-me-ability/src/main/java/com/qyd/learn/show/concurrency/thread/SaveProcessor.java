package com.qyd.learn.show.concurrency.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 10:20
 * @Description:
 */
public class SaveProcessor extends Thread implements RequestProceesor  {

    private LinkedBlockingQueue<Request> requestList=new LinkedBlockingQueue<>();

    volatile boolean isFinished=false;

    RequestProceesor nextProceesor;

    public SaveProcessor() {
    }

    public SaveProcessor(RequestProceesor nextProceesor) {
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
            System.out.println("SaveProcessor 处理："+take.getName());
            if(nextProceesor!=null){
                nextProceesor.process(take);
            }
        }
    }
}
