package com.show.single.login.controller;

import com.show.single.login.entity.UserLoginResponse;
import com.show.single.login.service.IUserService;
import com.show.single.login.entity.RequestLoginObj;
import com.show.single.login.entity.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController extends BaseController{

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public ResponseObj login(String username, String password, HttpServletRequest request){

        ResponseObj retObj=new ResponseObj();

        RequestLoginObj userLoginObj=new RequestLoginObj(username,password);

        UserLoginResponse userLoginResponse = userService.login(userLoginObj);



        //这里简单的实现查询登录
        if(password.equals(userMap.get(username))){

        };


        return  retObj;
    }
}
