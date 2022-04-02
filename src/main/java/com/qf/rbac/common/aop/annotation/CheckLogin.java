package com.qf.rbac.common.aop.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *  如果一个方法 加上了这个注解  那么这个方法执行之前 需要验证是否已经登录
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface CheckLogin {
}
