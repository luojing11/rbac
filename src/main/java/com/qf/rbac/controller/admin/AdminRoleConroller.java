package com.qf.rbac.controller.admin;

import com.qf.rbac.common.aop.annotation.CheckLogin;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.Role;
import com.qf.rbac.entity.dto.MenuDTO;
import com.qf.rbac.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/sys/role")
public class AdminRoleConroller {

    @Autowired
    private RoleService roleService;

    /**
     * 根据角色id获得菜单
     */
    @GetMapping("/list")
   // @CheckLogin
       public R findMenusByRoleID(HttpServletRequest request){
//          System.out.println(request.getAttribute("角色id："+"roleid"));
//        Integer roleid = Integer.parseInt(request.getAttribute("roleid").toString());
//        System.out.println(roleid);
        List<MenuDTO> menuDTOS = roleService.selectMenusByRoleid(1);
        return new R(ResponseEnum.SUCCESS,menuDTOS);
    }

    /**
     * 获得所有角色ok
     */
    @GetMapping("/info")
    public R getAllRole(){
        List<Role> allRole = roleService.getAllRole();
        return new R(ResponseEnum.SUCCESS,allRole);
    }

    /**
     * 添加角色ok
     */
    @PutMapping("/save")
    public R addAndCheckRole(@RequestBody Role role){
        roleService.addAndCheckRole(role);
        return new R(ResponseEnum.SUCCESS,null);
    }

    /**
     * 删除角色ok
     */
    @PostMapping("/delete")
    public R deleteRole(Integer roleid){
        roleService.deleteRole(roleid);
        return new R(ResponseEnum.SUCCESS,null);
    }

}
