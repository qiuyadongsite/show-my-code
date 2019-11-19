package com.qyd.learn.show.pattern.factory;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:50
 * @Description:
 */
public class BadPeople implements People {
    @Override
    public void createPeople() {
        System.out.println("create bad people!");
    }
}
