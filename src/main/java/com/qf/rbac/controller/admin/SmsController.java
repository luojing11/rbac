package com.qf.rbac.controller.admin;

import com.qf.rbac.common.aop.annotation.CheckLogin;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.config.JwtConfig;
import com.qf.rbac.entity.User;
import com.qf.rbac.entity.dto.LoginDTO;
import com.qf.rbac.service.InfoEditService;
import com.qf.rbac.service.SmsService;
import com.qf.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private UserService userService;

    @Autowired
    private InfoEditService infoEditService;



    private Map<String,String> redisMap = new HashMap<>();

    /**
     *  发送验证码
     * @return
     */
    @GetMapping("/{phone}")
    public R getCheckCode(@PathVariable("phone") String phone){
        // 1 产生4位数字的随机数
        int checkcode = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        // 2  发消息
        smsService.sendCheckCode(phone,checkcode+"");

        System.out.println("验证码：  "+checkcode);
        // 3 成功
        redisMap.put(phone,checkcode+"");

        return new R(ResponseEnum.SUCCESS,null);
    }
    /**
     * 手机短信登录
     */
    @PostMapping("/smslogin")
    public R<LoginDTO> telLogin(String phone,String checkcode){
        // 查询验证码 进行匹配
        String code = redisMap.get(phone);
        if (checkcode.equals(code)==false){  // NullPointerException
            return new R(ResponseEnum.CHECKCODE_ERROR,null);
        }
        LoginDTO loginDTO = smsService.tellogin(phone, code);
        // 生成token
        String token = jwtConfig.generateJwt(loginDTO);
        loginDTO.setToken(token);
        return new R(ResponseEnum.SUCCESS, loginDTO);
    }

    /**
     * 根据id获得用户信息
     */
    @GetMapping("/userList")
    @CheckLogin
    public R getUserById(HttpServletRequest request){
        String strid = request.getAttribute("userid").toString();
        Long id = Long.valueOf(strid);
        User user = userService.getUserById(id);
        return new R(ResponseEnum.SUCCESS,user);
    }

    /**
     * 验证用户名
     */
    @GetMapping("/check/{userName}")
    @CheckLogin
    public R checkUserName(@PathVariable("userName") String userName,HttpServletRequest request){
        // 1 获得当前用户的id
        String userid = request.getAttribute("userid").toString();
        System.out.println("获得当前用户的id"+userid);
        Long id = new Long(userid);
        boolean flag = infoEditService.checkUserName(userName, id);

        return new R(ResponseEnum.SUCCESS,flag);
    }

    /**
     * 修改用户信息
     */
    @PutMapping("/edit")
    public R updateUserInfo(@RequestBody User user){
        infoEditService.updateUserInfo(user);
        return new R(ResponseEnum.SUCCESS,null);
    }


}
