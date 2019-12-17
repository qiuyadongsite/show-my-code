package com.qyd.learn.show.concurrency.thread;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/20 14:22
 * @Description:
 */
public class VolatileDemo {
    public  static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            int i=0;
            while (!stop){
                i++;
            }
            System.out.println(i);
        });
        thread.start();
        System.out.println("before start thread");
        Thread.sleep(1000);
        stop=true;
    }
}
