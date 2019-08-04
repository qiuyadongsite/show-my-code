package com.qyd.learn.show.pattern.strategy.pay.payport;

/**
 * qyd.
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
