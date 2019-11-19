package com.qyd.learn.show.pattern.singleton.threadlocal;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:42
 * @Description:
 */
public class ThreadLocalSingleton {
    private final static ThreadLocal<ThreadLocalSingleton> threadLocal=new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){

    }
    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }
}
