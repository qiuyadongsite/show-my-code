package com.qyd.learn.show.jdk8.methodandConstructorReference;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/21 14:55
 * @Description:
 */
public interface PersonFactory<P extends Person> {

    P create(String name,String address);
}
