package com.show.single.login.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {

    static  ThreadLocal<String> uidThreadLocal=new ThreadLocal<>();

    public void setUid(String uid){
        uidThreadLocal.set(uid);
    }
    public String getUid(){
        return  uidThreadLocal.get();
    }
}
