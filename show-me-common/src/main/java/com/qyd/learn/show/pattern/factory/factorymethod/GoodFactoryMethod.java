package com.qyd.learn.show.pattern.factory.factorymethod;

import com.qyd.learn.show.pattern.factory.GoodPeople;
import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:57
 * @Description:
 */
public class GoodFactoryMethod implements IFactoryMethod {
    @Override
    public People createPeople() {
        return  new GoodPeople();
    }
}
