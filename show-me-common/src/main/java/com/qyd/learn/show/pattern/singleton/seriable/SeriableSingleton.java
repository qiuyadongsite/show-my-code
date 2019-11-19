package com.qyd.learn.show.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:38
 * @Description:
 */
public class SeriableSingleton implements Serializable {
    private final static Serializable INSTANCE=new SeriableSingleton();
    private SeriableSingleton(){}
    public static Serializable getInstance(){return INSTANCE ;}

    private  Object readResolve(){
        return  INSTANCE;
    }
}
