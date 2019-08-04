package com.qyd.learn.show.pattern.proxy.simpleproxy;

/**
 * qyd.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("real service is called.");
    }
}
