package com.qyd.learn.show.pattern.singleton.hungry;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:13
 * @Description:
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1=HungrySingleton.getSingleton();
        HungrySingleton hungrySingleton2=HungrySingleton.getSingleton();
        System.out.println(hungrySingleton1==hungrySingleton2);
    }
}
