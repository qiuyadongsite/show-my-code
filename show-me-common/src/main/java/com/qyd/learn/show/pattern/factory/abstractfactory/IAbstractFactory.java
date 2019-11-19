package com.qyd.learn.show.pattern.factory.abstractfactory;

import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:03
 * @Description:抽象工厂其实就是工厂方法增加了生产的类型
 */
public interface IAbstractFactory {
    People createPeople();
    Home createHome();
}
