package com.qyd.learn.show.pattern.factory.abstractfactory;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:08
 * @Description:
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IAbstractFactory abstractFactory=new GoodAbstractFactory();
        Home home = abstractFactory.createHome();
       home.createHome();
       abstractFactory.createPeople().createPeople();
    }
}
