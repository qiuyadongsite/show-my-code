package com.show.single.login.entity;

import lombok.Data;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:21
 * @Description:
 */
@Data
public class UserLoginResponse extends AbstractResponse {
    private static final long serialVersionUID = -3378327818482116567L;


    String uid;
    private String token;

}
