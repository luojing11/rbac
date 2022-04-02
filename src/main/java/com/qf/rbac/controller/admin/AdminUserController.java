package com.qf.rbac.controller.admin;

import com.github.pagehelper.PageInfo;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.User;
import com.qf.rbac.entity.dto.UserDTO;
import com.qf.rbac.service.PagingService;
import com.qf.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/sys/user")
public class AdminUserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PagingService pagingService;



    //根据登录用户的名字去查id
    public User selectUser(String name) {
        return userService.selectUser(name);
    }


    /**
     * 获得所有的用户
     * roleid,phone,bonus,isvip,roles信息
     */
    @GetMapping("/list")
    public R seleectAllUser(){
        List<UserDTO> userDTOS = userService.selectAllUser();
        return new R(ResponseEnum.SUCCESS,userDTOS);
    }
    /**
     * 获得 user表 所有的roleid
     * getUserRoleId
     */
    @GetMapping("/getroleid")
    public R getUserRoleId(){
        List<UserDTO> userDTOS = userService.getUserRoleId();
        return new R(ResponseEnum.SUCCESS,userDTOS);
    }
    
    /**
     * 根据输入条件查询
     */
    @PostMapping("/search")
    public R queryByInputCondition(Long phone, Integer roleid,Boolean isvip){
        System.out.println("角色id："+roleid);
        List<UserDTO> userDTOS = userService.queryByInputCondition(phone,roleid,isvip);
        return new R(ResponseEnum.SUCCESS,userDTOS);
    }

    /**
     * 分页
     */
    @GetMapping("/page")
    public R PagingAllUserByPage(Integer pageNum, Integer pageSize,Long phone,Integer roleid,Boolean isvip){
        //调用方法进行分页查询
//        System.out.println(phone+"------"+roleid+"--------"+isvip);
//        System.out.println("分页"+pageNum+"-------"+pageSize);
        PageInfo<UserDTO> userDTO = pagingService.findAllByPage
                (pageNum, pageSize,phone,roleid,isvip);
        return new R(ResponseEnum.SUCCESS,userDTO);
    }

    /**
     * 修改User 角色信息
     */
    @PostMapping("/update")
    public R updateRoleName(Long id,String rolename) {
//        System.out.println(id+"-----------"+rolename);
        userService.updateRolesById(id,rolename);
        return new R(ResponseEnum.SUCCESS,null);
    }

    /**
     * 修改User 角色信息 测试
     */
    @PostMapping("/testupdate")
    public R Test(Long id,Integer roleid,String rolename) {
        System.out.println(id+"-----"+roleid+"------"+rolename);
        userService.updateRoleInfo(id,roleid,rolename);
        return new R(ResponseEnum.SUCCESS,null);
    }

}
