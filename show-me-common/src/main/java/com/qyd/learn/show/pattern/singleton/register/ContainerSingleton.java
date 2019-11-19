package com.qyd.learn.show.pattern.singleton.register;

import java.util.HashMap;

/**
 * @Auther: qiuyd
 * @Date: 2019/8/6 17:20
 * @Description:
 */
public class ContainerSingleton {
    private static HashMap<String,Object> objectHashMap=new HashMap<>();

    public static Object getInstance(String className){
        synchronized (objectHashMap){
            if(objectHashMap.containsKey(className)){
                return objectHashMap.get(className);
            }else{
                try {
                    return Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
    }

}
