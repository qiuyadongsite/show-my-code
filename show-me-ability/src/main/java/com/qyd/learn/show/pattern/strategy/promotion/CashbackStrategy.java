package com.qyd.learn.show.pattern.strategy.promotion;

/**
 * 返现活动
 * qyd
 */
public class CashbackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
