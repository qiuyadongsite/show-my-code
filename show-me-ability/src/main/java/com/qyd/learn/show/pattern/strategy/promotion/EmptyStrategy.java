package com.qyd.learn.show.pattern.strategy.promotion;
/**
 * 无优惠
 * qyd
 */
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
