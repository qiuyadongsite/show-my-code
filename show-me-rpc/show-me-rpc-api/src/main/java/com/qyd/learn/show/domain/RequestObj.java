package com.qyd.learn.show.domain;

import java.io.Serializable;

/**
 * @Auther: qiuyd
 * @Date: 2019/6/6 11:14
 * @Description:
 */
public class RequestObj implements Serializable {

    private String className;

    private String methodName;

    private Object[] args;

    private Class[] types;

    public RequestObj() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public Class[] getTypes() {
        return types;
    }

    public void setTypes(Class[] types) {
        this.types = types;
    }
}
