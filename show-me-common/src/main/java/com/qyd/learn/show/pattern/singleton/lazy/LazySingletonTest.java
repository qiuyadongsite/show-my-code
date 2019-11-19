package com.qyd.learn.show.pattern.singleton.lazy;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:17
 * @Description:
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton singleton=LazySingleton.getLazySingleton();
        LazySingleton singleton2=LazySingleton.getLazySingleton();
        System.out.println(singleton==singleton2);
    }
}
