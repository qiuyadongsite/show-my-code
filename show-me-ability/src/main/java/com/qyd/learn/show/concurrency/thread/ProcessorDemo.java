package com.qyd.learn.show.concurrency.thread;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 10:21
 * @Description:
 */
public class ProcessorDemo {
    public static void main(String[] args) {
        Request request=new Request();
        request.setName("test");

        SaveProcessor saveProcessor=new SaveProcessor();
        saveProcessor.start();
        PrintProcessor printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();
        PreProcessor preProcessor = new PreProcessor(printProcessor);
        preProcessor.start();
        preProcessor.process(request);



    }
}
