package com.qf.rbac.controller.member;

import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.User;
import com.qf.rbac.entity.member.AppletUserinfo;
import com.qf.rbac.service.UserService;
import com.qf.rbac.service.member.AppletUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class AppletUserinfoController {
    @Autowired
    public AppletUserinfoService appletUserinfoService;

    @Autowired
    public UserService userService;

    @GetMapping("/list")
    public R selectAppletUser(){
//        String username= SecurityContextHolder.getContext().getAuthentication().getName();
//        User user=userService.selectUser(username);
        List<AppletUserinfo> userinfos=appletUserinfoService.selectAppletUser(1L);
        return new R(ResponseEnum.SUCCESS,userinfos);
    }

    @PostMapping("/query")
    public R selectAppletUserName(String username){
        List<AppletUserinfo> userinfoList=appletUserinfoService.selectAppletUserName(username);
        return new R(ResponseEnum.SUCCESS,userinfoList);
    }

    @PostMapping("/insert")
    public R insertSelective(@RequestBody AppletUserinfo appletUserinfo){
        int appinsert=appletUserinfoService.insertSelective(appletUserinfo);
        return new R(ResponseEnum.SUCCESS,appinsert);
    }

    @PostMapping("/update")
    public R updateByPrimaryKeySelective(@RequestBody AppletUserinfo appletUserinfo){
        int appupdate=appletUserinfoService.updateByPrimaryKeySelective(appletUserinfo);
        return new R(ResponseEnum.SUCCESS,appupdate);
    }

    @PostMapping("/deletc")
    public R updateByPrimaryKeySelective(Integer id){
        int appdelect=appletUserinfoService.deleteByPrimaryKey(id);
        return new R(ResponseEnum.SUCCESS,appdelect);
    }

}
