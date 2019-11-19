package com.qyd.learn.show.pattern.factory.simplefactory;

import com.qyd.learn.show.pattern.factory.BadPeople;
import com.qyd.learn.show.pattern.factory.GoodPeople;
import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:51
 * @Description:简单工厂又称为静态工厂，每增加一个新的类都需要修改工厂，不符合开闭原则，
 * 小作坊，啥也干。
 */
public class SimpleFactory {
    public static People createPeople(String peopleType) {

        if("bad".equals(peopleType)){
            return new BadPeople();
        }else{
            return new GoodPeople();
        }
    }
}
