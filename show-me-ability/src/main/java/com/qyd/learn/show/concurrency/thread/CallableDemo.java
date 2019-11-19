package com.qyd.learn.show.concurrency.thread;

import javax.security.auth.callback.Callback;
import java.util.concurrent.*;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 09:53
 * @Description:
 */
public class CallableDemo implements Callable {
    @Override
    public Object call() throws Exception {
        return "返回处理！";
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        CallableDemo callableDemo=new CallableDemo();
        Future submit = executorService.submit(callableDemo);
        Object o = null;
        try {
            o = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(o);

        executorService.shutdown();


    }
}
