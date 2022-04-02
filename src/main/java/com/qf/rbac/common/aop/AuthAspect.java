package com.qf.rbac.common.aop;

import com.qf.rbac.common.aop.annotation.CheckRight;
import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.config.JwtConfig;
import com.qf.rbac.entity.dto.LoginDTO;
import com.qf.rbac.service.RightService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.List;

@Component
@Aspect
public class AuthAspect {

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private RightService rightService;

    @Before("@annotation(com.qf.rbac.common.aop.annotation.CheckLogin)")
    public void beforeCheckLogin(JoinPoint jp) throws Throwable {
        // 1 获得request
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        // 2 从请求中获得token
        String token = request.getHeader("X-Token");
        //
        // System.out.println(request.getHeader("X-Token"));
        // 判断是否为空
        if (StringUtils.isEmpty(token)){
            throw new AppException(ResponseEnum.NO_TOKEN);
        }
        // 验证token
        LoginDTO loginDTO = jwtConfig.checkJwt(token);
        //  把角色id 往后面传
        Integer roleid = loginDTO.getRoleid();

        request.setAttribute("roleid",roleid);
        // 用户id
    }

    @Before("@annotation(com.qf.rbac.common.aop.annotation.CheckRight)")
    public void beforeCheckRight(JoinPoint jp) throws Throwable {
        // 1 获得request
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        // 2 从请求中获得token
        String token = request.getHeader("X-Token");
        // 判断是否为空
        if (StringUtils.isEmpty(token)){
            throw new AppException(ResponseEnum.NO_TOKEN);
        }
        // 验证token
        LoginDTO loginDTO = jwtConfig.checkJwt(token);
        //
        Integer roleid = loginDTO.getRoleid();
        //  根据角色来获得 这个角色拥有的权限码的集合  [    ]
        List<String> codes = rightService.selectRightCodesByRoleId(roleid);
        // 通过反射获得 进入的方法 必须拥有的权限码 字符串
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        CheckRight checkRight = method.getDeclaredAnnotation(CheckRight.class);
        // 要执行这个方法需要的权限码
        String rightcode = checkRight.value();
        // 字符串是否在集合当中
        if (codes.contains(rightcode)==false){
            //  如果没有该权限.. 抛出异常
            throw new AppException(ResponseEnum.HAS_NO_RIGHT);
        }
    }
}
