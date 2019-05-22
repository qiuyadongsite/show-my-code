package com.show.single.login.entity;

import lombok.Data;

@Data
public class ResponseObj {
    private String code;
    private String msg;
    private Object data;
}
