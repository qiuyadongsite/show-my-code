package com.show.single.login.intercept;

import com.show.single.login.annotation.NoValidation;
import com.show.single.login.constants.WebConstant;
import com.show.single.login.controller.BaseController;
import com.show.single.login.entity.CheckAuthRequest;
import com.show.single.login.entity.CheckAuthResponse;
import com.show.single.login.service.IUserService;
import com.show.single.login.utils.CookieUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class TokenIntercepter extends HandlerInterceptorAdapter {

    @Autowired
    IUserService userService;

    private final String ACCESS_TOKEN="access_token";

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        if(!(handler instanceof HandlerMethod)){
            return true;
        }

        HandlerMethod handlerMethod=(HandlerMethod)handler;
        Object bean=handlerMethod.getBean();

        if(isNoValidation(handlerMethod)){
            return true;
        }
        if(!(bean instanceof BaseController)){
            throw new RuntimeException("must extend basecontroller");
        }
        String token=CookieUtil.getCookieValue(request,ACCESS_TOKEN);
        boolean isAjax= CookieUtil.isAjax(request);
        if(StringUtils.isEmpty(token)){
            if(isAjax){
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write("{\"code\":\"-1\",\"msg\":\"error\"}");
                return false;
            }
            response.sendRedirect(WebConstant.LOGIN_URL);
            return false;
        }
        CheckAuthRequest checkAuthRequest=new CheckAuthRequest();
        checkAuthRequest.setToken(token);
        CheckAuthResponse checkAuthResponse=userService.validToken(checkAuthRequest);
        if("000000".equals(checkAuthResponse.getCode())){
            BaseController baseController=(BaseController)bean;
            baseController.setUid(checkAuthResponse.getUid());
            return super.preHandle(request, response, handler);
        }
        if(isAjax){
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("{\"code\":\""+checkAuthResponse.getCode()+"\"" +
                    ",\"msg\":\""+checkAuthResponse.getMsg()+"\"}");
            return false;
        }
        response.sendRedirect(WebConstant.LOGIN_URL);
        return false;
    }

    private boolean isNoValidation(HandlerMethod handlerMethod){
        Object bean=handlerMethod.getBean();
        Class clazz=bean.getClass();
        if(clazz.getAnnotation(NoValidation.class)!=null){
            return true;
        }
        Method method=handlerMethod.getMethod();
        return method.getAnnotation(NoValidation.class)!=null;
    }
}
