package com.qyd.learn.show.pattern.factory;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:49
 * @Description:
 */
public class GoodPeople implements People {
    @Override
    public void createPeople() {
        System.out.println("create good people!");
    }
}
