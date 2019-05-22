package com.show.single.login.entity;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:21
 * @Description:
 */
public class UserLoginResponse extends AbstractResponse {
    private static final long serialVersionUID = -3378327818482116567L;


    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
