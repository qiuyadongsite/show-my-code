package com.qyd.learn.show.pattern.singleton.hungry;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:11
 * @Description:安全、有效，但是费空间
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton= new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getSingleton(){
        return hungrySingleton;
    }
}
