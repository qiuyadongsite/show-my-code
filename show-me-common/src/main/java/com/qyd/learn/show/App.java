package com.qyd.learn.show;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        ReentrantLock lock=new ReentrantLock();
        lock.lock();
        lock.unlock();

        t2();
    }
    public void sayHi(){
        System.out.println("say hi!");
    }
    public synchronized static void t2() throws Exception
    {
        Thread t = new Thread(new Runnable()
        {
            private int count = 0;

            @Override
            public void run()
            {
                long start = System.currentTimeMillis();
                long end = 0;

                while ((end - start) <= 1000)
                {
                    count++;
                    end = System.currentTimeMillis();
                }

                System.out.println("after 1 second.count=" + count);

                //等待或许许可
                LockSupport.park();
                System.out.println("thread over." + Thread.currentThread().isInterrupted());

            }
        });

        t.start();
        t.isInterrupted();
        Thread.sleep(2000);
     /*   t.interrupt();*/
        LockSupport.unpark(t);
       // 中断线程





        System.out.println("main over");
    }

}
