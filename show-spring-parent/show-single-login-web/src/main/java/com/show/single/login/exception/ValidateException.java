package com.show.single.login.exception;

import com.show.single.login.entity.ResponseCodeEnum;

/**
 * @Auther: qiuyd
 * @Date: 2019/5/22 13:54
 * @Description:
 */
public class ValidateException extends RuntimeException {

    private static final long serialVersionUID = 7172827201346602909L;

    private String errorCode;

    private String errorMessage;

    public ValidateException() {
        super();
    }

    public ValidateException(String errorCode) {
        super(errorCode);
        this.errorCode= ResponseCodeEnum.SYS_PARAM_NOT_RIGHT.getCode();
        this.errorMessage=ResponseCodeEnum.SYS_PARAM_NOT_RIGHT.getMsg();
    }
    public ValidateException(Throwable cause) {
        super(cause);
    }
    public ValidateException(String errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ValidateException(String errorCode, String message) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = message;
    }


    public ValidateException(String errorCode, String message, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMessage = message;
    }


    public String getErrorCode() {
        return errorCode;
    }


    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}

