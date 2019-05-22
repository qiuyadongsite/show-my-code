package com.show.single.login.service;

import com.show.single.login.entity.CheckAuthRequest;
import com.show.single.login.entity.CheckAuthResponse;
import com.show.single.login.entity.RequestLoginObj;
import com.show.single.login.entity.UserLoginResponse;

public interface IUserService {

    UserLoginResponse login(RequestLoginObj requestLoginObj);

    CheckAuthResponse validToken(CheckAuthRequest request);
}
