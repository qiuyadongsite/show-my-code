package com.qyd.learn.show.jdk8.functionalinterface;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:41
 * @Description:
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
