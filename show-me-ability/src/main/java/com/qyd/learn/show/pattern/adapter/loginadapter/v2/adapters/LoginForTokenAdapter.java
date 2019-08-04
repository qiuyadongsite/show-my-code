package com.qyd.learn.show.pattern.adapter.loginadapter.v2.adapters;

import com.qyd.learn.show.pattern.adapter.loginadapter.ResultMsg;

/**
 * qyd.
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
