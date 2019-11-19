package com.qyd.learn.show.pattern.factory.factorymethod;

import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:59
 * @Description:工厂方法模式将类的创建推迟到实现工厂接口的子工厂中，客户只需要关注子工厂接口即可
 * 相当于专业工厂，流水线
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactoryMethod method=new GoodFactoryMethod();
        People asd = method.createPeople();
        asd.createPeople();
    }
}
