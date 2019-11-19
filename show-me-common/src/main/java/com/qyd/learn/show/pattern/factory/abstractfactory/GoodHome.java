package com.qyd.learn.show.pattern.factory.abstractfactory;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:06
 * @Description:
 */
public class GoodHome implements Home {
    @Override
    public void createHome() {
        System.out.println("create good home!");
    }
}
