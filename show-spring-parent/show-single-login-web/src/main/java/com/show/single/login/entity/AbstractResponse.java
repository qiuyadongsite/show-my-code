package com.show.single.login.entity;

import java.io.Serializable;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:14
 * @Description:
 */
public class AbstractResponse implements Serializable {

    private static final long serialVersionUID = -9022977194836257819L;

    private String code;
    private String msg;

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
