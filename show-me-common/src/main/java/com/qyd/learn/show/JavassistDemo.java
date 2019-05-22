package com.qyd.learn.show;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

public class JavassistDemo {
    public static void main(String[] args) throws Exception{

       /* testPool();*/

        sayhi();
    }

    private static void sayhi()  throws Exception{
        ClassPool cp = ClassPool.getDefault();
        CtClass cc = cp.get("com.qyd.learn.show.App");
        CtMethod m = cc.getDeclaredMethod("sayHi");
        m.insertBefore("{ System.out.println(\"Before App.sayHi():\"); }");
        m.insertAt(2,"{ System.out.println(\"Before 2 App.sayHi():\"); }");

        Class c = cc.toClass();
        App h = (App)c.newInstance();
        h.sayHi();

    }

    private static void testPool()throws Exception {

        ClassPool pool = ClassPool.getDefault();
        CtClass cc = pool.get("com.qyd.learn.show.ByteCode");
        cc.setSuperclass(pool.get("com.qyd.learn.show.ByteCode"));


    }

}
