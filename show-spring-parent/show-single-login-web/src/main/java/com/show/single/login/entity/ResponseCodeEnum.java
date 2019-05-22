package com.show.single.login.entity;

public enum ResponseCodeEnum {
    SUCCESS("00","登录成功！"),FAIL("01","登录失败！");

    private String code;
    private String msg;

     ResponseCodeEnum(String code,String msg){
        this.code=code;
        this.msg= msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
