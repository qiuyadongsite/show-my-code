package com.qyd.learn.show.jdk8.defaultmethod;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:19
 * @Description:
 */
public interface Formula {
    double calculate(int a);
    default double sqrt(int a){
        return Math.sqrt(a);
    }
    default double sqrt2(int a){
        return Math.sqrt(a);
    }
}
