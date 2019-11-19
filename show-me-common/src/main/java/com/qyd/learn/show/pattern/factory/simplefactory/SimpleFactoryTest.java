package com.qyd.learn.show.pattern.factory.simplefactory;

import com.qyd.learn.show.pattern.factory.People;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 16:51
 * @Description:
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        People people=SimpleFactory.createPeople("peopleType");
        people.createPeople();
    }
}
