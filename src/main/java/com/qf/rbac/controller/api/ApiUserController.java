package com.qf.rbac.controller.api;

import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.config.JwtConfig;
import com.qf.rbac.entity.User;
import com.qf.rbac.entity.dto.LoginDTO;
import com.qf.rbac.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;


@RestController
@CrossOrigin("*")
@RequestMapping("/user2")
public class ApiUserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtConfig jwtConfig;

    /**
     * 用户密码登录
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login2")
    public R<LoginDTO> login(String username, String password, @RequestParam Map<String,Object> parm, HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(10*60);
        User user = userService.login(username, password);
        System.out.println(user);
        session.setAttribute(username,username);
        System.out.println("111111111111111111111111");
        System.out.println(session.getAttribute(username));
        LoginDTO loginDTO = new LoginDTO();
        BeanUtils.copyProperties(user, loginDTO);
        // 生成token
        String token = jwtConfig.generateJwt(loginDTO);

        loginDTO.setToken(token);
        return new R(ResponseEnum.SUCCESS, loginDTO);

    }

    @GetMapping("/logout")
    public AppException logout(){
        AppException appException=new AppException();
        return appException;

    }






}
