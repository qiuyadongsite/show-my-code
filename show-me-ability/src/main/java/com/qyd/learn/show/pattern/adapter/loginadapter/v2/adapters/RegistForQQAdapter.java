package com.qyd.learn.show.pattern.adapter.loginadapter.v2.adapters;

import com.qyd.learn.show.pattern.adapter.loginadapter.ResultMsg;

/**
 * qyd on 2019/3/16.
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
