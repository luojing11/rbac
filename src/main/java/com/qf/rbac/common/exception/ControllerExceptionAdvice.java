package com.qf.rbac.common.exception;

import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionAdvice {

    /**
     *  controller 如果抛出的异常是 AppExeption 那么就到这个方法中做增强
     *  参数1： 抛出来的异常
     *  参数2： request
     * @return
     */
    @ExceptionHandler(AppException.class)
    @ResponseBody
    public R appExceptionHander(AppException ex){
        R r = new R(ex.getCode(),ex.getMessage(),null);
        return r;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R exceptionHander(Exception ex, HttpServletRequest request){
        ex.printStackTrace();
        return new R(ResponseEnum.SYSTEM_ERROR,null);
    }
    /**
     *  token 无效
     */
    @ExceptionHandler(SignatureException.class)
    @ResponseBody
    public R exceptionHander(SignatureException ex, HttpServletRequest request){

        return new R(ResponseEnum.TOKEN_INVALIDATE,null);
    }

    /**
     *  token 超时
     */
    @ExceptionHandler(ExpiredJwtException.class)
    @ResponseBody
    public R exceptionHander(ExpiredJwtException ex, HttpServletRequest request){

        return new R(ResponseEnum.TOKEN_EXPIRED,null);
    }
}
