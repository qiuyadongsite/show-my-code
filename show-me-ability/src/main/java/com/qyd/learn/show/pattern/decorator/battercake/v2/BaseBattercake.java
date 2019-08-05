package com.qyd.learn.show.pattern.decorator.battercake.v2;

/**
 * qyd on 2019/3/17.
 */
public class BaseBattercake extends Battercake {
    protected String getMsg(){
        return "煎饼";
    }

    public int getPrice(){
        return 5;
    }
}
