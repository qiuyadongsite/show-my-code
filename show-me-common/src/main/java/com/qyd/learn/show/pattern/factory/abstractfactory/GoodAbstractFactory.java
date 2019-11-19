package com.qyd.learn.show.pattern.factory.abstractfactory;

import com.qyd.learn.show.pattern.factory.GoodPeople;
import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:07
 * @Description:
 */
public class GoodAbstractFactory implements IAbstractFactory {
    @Override
    public People createPeople() {
        return new GoodPeople();
    }

    @Override
    public Home createHome() {
        return new GoodHome();
    }
}
