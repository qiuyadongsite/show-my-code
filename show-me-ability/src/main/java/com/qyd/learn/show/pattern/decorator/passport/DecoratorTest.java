package com.qyd.learn.show.pattern.decorator.passport;

import com.qyd.learn.show.pattern.decorator.passport.old.SigninService;
import com.qyd.learn.show.pattern.decorator.passport.upgrade.ISiginForThirdService;
import com.qyd.learn.show.pattern.decorator.passport.upgrade.SiginForThirdService;


/**
 * qyd on 2019/3/17.
 */
public class DecoratorTest {

    public static void main(String[] args) {

        //满足一个is-a
        ISiginForThirdService siginForThirdService = new SiginForThirdService(new SigninService());
        siginForThirdService.loginForQQ("sdfasfdasfsf");

    }


}
