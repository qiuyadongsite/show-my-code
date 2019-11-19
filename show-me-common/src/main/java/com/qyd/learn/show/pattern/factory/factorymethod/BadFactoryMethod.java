package com.qyd.learn.show.pattern.factory.factorymethod;

import com.qyd.learn.show.pattern.factory.BadPeople;
import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:58
 * @Description:
 */
public class BadFactoryMethod implements IFactoryMethod {

    @Override
    public People createPeople() {
        return new BadPeople();
    }
}
