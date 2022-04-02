package com.qf.rbac.controller.api;

import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.config.JwtConfig;

import com.qf.rbac.entity.SysUser;
import com.qf.rbac.entity.dto.LoginDTO;
import com.qf.rbac.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private JwtConfig jwtConfig;

    @PostMapping("/login")
    public R<LoginDTO> login2(String username, String password, HttpSession session){
        SysUser sysUser = sysUserService.login2(username, password);
        session.setAttribute("username",sysUser.getUsername());
        session.setAttribute("password",sysUser.getPassword());
        LoginDTO loginDTO = new LoginDTO();
        BeanUtils.copyProperties(sysUser, loginDTO);
        // 生成token
        String token = jwtConfig.generateJwt(loginDTO);

        loginDTO.setToken(token);
        return new R(ResponseEnum.SUCCESS, loginDTO);
    }


    /**
     * 修改密码功能实现
     * @param userName
     * @param oldPassword
     * @param newPassword

     * @return
     */
    @PostMapping("/changePassword")
    @ResponseBody
    public R changePassword(@RequestParam("userName") String userName, @RequestParam("oldPassword") String oldPassword, @RequestParam("newPassword") String newPassword){
        SysUser sysUser=sysUserService.updateUser(userName,oldPassword);
        SysUser user=sysUserService.changePassword(userName,newPassword);
        return new R(ResponseEnum.SUCCESS,user);
    }

    //退出登录
    @GetMapping("/exit")
    public String exit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return "redirect:/login";
    }



}
