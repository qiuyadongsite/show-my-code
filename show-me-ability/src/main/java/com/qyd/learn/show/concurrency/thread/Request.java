package com.qyd.learn.show.concurrency.thread;

/**
 * @Auther: qiuyd
 * @Date: 2019/11/19 10:00
 * @Description:
 */
public class Request {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                '}';
    }
}
