package com.show.single.login.intercept;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import java.lang.reflect.Method;

public class TokenIntercepter implements WebRequestInterceptor {
    @Override
    public void preHandle(WebRequest webRequest) throws Exception {

    }

    @Override
    public void postHandle(WebRequest webRequest, ModelMap modelMap) throws Exception {

    }

    @Override
    public void afterCompletion(WebRequest webRequest, Exception e) throws Exception {

    }
}
