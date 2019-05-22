package com.show.single.login.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.show.single.login.dao.UserMapper;
import com.show.single.login.domain.User;
import com.show.single.login.entity.*;
import com.show.single.login.exception.ExceptionUtil;
import com.show.single.login.exception.ServiceException;
import com.show.single.login.exception.ValidateException;
import com.show.single.login.service.IUserService;
import com.show.single.login.utils.JwtTokenUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 11:25
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    Logger log= LoggerFactory.getLogger(this.getClass());

    private UserMapper userMapper=new UserMapper();

    @Override
    public UserLoginResponse login(RequestLoginObj requestLoginObj) {

        log.info("before request："+requestLoginObj);

        UserLoginResponse response=new UserLoginResponse();
        try {
            beforeValidate(requestLoginObj);
            User user= userMapper.getPasswordByName(requestLoginObj.getUserName());

            if(user==null||!user.getPwd().equals(requestLoginObj.getPassword())){
                response.setCode(ResponseCodeEnum.USERORPASSWORD_ERRROR.getCode());
                response.setMsg(ResponseCodeEnum.USERORPASSWORD_ERRROR.getMsg());
                return response;
            }
            Map<String,Object> map=new HashMap<>();
            map.put("uid",user.getId());
            //设置token过期时间为40秒用于测试，一般设置为1天
            map.put("exp", DateTime.now().plusSeconds(40).toDate().getTime()/1000);

            response.setToken(JwtTokenUtils.generatorToken(map));

            response.setUid(user.getId());
            response.setCode(ResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(ResponseCodeEnum.SUCCESS.getMsg());
        }catch (Exception e){
            log.error("login occur exception :"+e);
            ServiceException serviceException=(ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMsg(serviceException.getErrorMessage());
        }finally {
            log.info("login response->"+response);
        }

        return response;
    }

    @Override
    public CheckAuthResponse validToken(CheckAuthRequest request) {
        CheckAuthResponse response=new CheckAuthResponse();
        try{
            beforeValidateAuth(request);

            Claims claims=JwtTokenUtils.phaseToken(request.getToken());
            response.setUid(claims.get("uid").toString());
            response.setCode(ResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(ResponseCodeEnum.SUCCESS.getMsg());

        }catch (ExpiredJwtException e){
            log.error("Expire :"+e);
            response.setCode(ResponseCodeEnum.TOKEN_EXPIRE.getCode());
            response.setMsg(ResponseCodeEnum.TOKEN_EXPIRE.getMsg());
        }catch (SignatureException e1){
            log.error("SignatureException :"+e1);
            response.setCode(ResponseCodeEnum.SIGNATURE_ERROR.getCode());
            response.setMsg(ResponseCodeEnum.SIGNATURE_ERROR.getMsg());
        }catch (Exception e){
            log.error("login occur exception :"+e);
            ServiceException serviceException=(ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMsg(serviceException.getErrorMessage());
        }finally {
            log.info("response:"+response);
        }

        return response;
    }

    private void beforeValidate(RequestLoginObj request){
        if(request==null){
            throw new ValidateException("请求对象为空");
        }
        if(StringUtils.isEmpty(request.getUserName())){
            throw new ValidateException("用户名为空");
        }
        if(StringUtils.isEmpty(request.getPassword())){
            throw new ValidateException("密码为空");
        }
    }
    private void beforeValidateAuth(CheckAuthRequest request){
        if(request==null){
            throw new ValidateException("请求对象为空");
        }
        if(StringUtils.isEmpty(request.getToken())){
            throw new ValidateException("token信息为空");
        }
    }
}
