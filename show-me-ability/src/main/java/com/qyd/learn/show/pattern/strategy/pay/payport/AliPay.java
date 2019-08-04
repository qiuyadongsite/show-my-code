package com.qyd.learn.show.pattern.strategy.pay.payport;


/**
 * qyd.
 */
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
