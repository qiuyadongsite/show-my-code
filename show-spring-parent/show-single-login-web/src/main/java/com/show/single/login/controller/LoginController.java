package com.show.single.login.controller;

import com.show.single.login.annotation.NoValidation;
import com.show.single.login.entity.UserLoginResponse;
import com.show.single.login.service.IUserService;
import com.show.single.login.entity.RequestLoginObj;
import com.show.single.login.entity.ResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController extends BaseController{

    @Autowired
    private IUserService userService;

    @NoValidation
    @RequestMapping("/login")
    public ResponseObj login(String username, String password, HttpServletResponse response){

        ResponseObj retObj=new ResponseObj();

        RequestLoginObj userLoginObj=new RequestLoginObj(username,password);

        UserLoginResponse userLoginResponse = userService.login(userLoginObj);

        response.addHeader("Set-Cookie",
                "access_token="+userLoginResponse.getToken()+";Path=/;HttpOnly");

        retObj.setMsg(userLoginResponse.getMsg());
        retObj.setCode(userLoginResponse.getCode());
        retObj.setData("others");
        return  retObj;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(String username, String password, HttpServletResponse response){

       String id=getUid();

        return  id;
    }
}
