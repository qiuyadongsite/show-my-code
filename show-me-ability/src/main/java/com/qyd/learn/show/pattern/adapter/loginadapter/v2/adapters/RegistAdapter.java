package com.qyd.learn.show.pattern.adapter.loginadapter.v2.adapters;

import com.qyd.learn.show.pattern.adapter.loginadapter.ResultMsg;

/**
 * qyd on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
