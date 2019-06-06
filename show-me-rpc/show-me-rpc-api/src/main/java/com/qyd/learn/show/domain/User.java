package com.qyd.learn.show.domain;

import java.io.Serializable;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 09:24
 * @Description:
 */
public class User implements Serializable {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
