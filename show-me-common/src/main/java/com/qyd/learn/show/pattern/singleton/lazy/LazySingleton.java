package com.qyd.learn.show.pattern.singleton.lazy;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:14
 * @Description:
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){}
    public static LazySingleton getLazySingleton(){
        if(lazySingleton==null){
            synchronized (LazySingleton.class){
                if(lazySingleton==null){
                    lazySingleton=new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
