package com.qf.rbac.controller.admin;

import com.qf.rbac.common.aop.annotation.CheckLogin;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.dto.GrantDTO;
import com.qf.rbac.entity.dto.MenuDTO;
import com.qf.rbac.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/right")
public class AdminRightController {

    @Autowired
    private RightService rightService;

    /**
     * 根据父类id 查询菜单
     * 菜单赋权ok
     * 获得系统中所有的菜单权限 层级格式返回
     */
        @GetMapping("/allrights")
    //@CheckLogin
    public R selectMenuRightByParentId(){
        List<MenuDTO> menuDTOS = rightService.selectMenuRightByParentId();
        return new R(ResponseEnum.SUCCESS,menuDTOS);
    }

    /**
     * g根据角色id获得拥有的权限id的集合
     * 包含父节点
     */
    @GetMapping("/grants/{roleid}")
    //@CheckLogin
    public R getRightsByRoleidNoParent(@PathVariable("roleid") Integer roleid){
        List<Integer> integers = rightService.selectRightidsByRoleIdNoParent(roleid);
        return new R(ResponseEnum.SUCCESS,integers);
    }

    /**
     * 给指定的角色赋权 菜单赋权
     */

    @PutMapping("/grant/menus")
    //@CheckLogin
    public R grantMenuRights(@RequestBody GrantDTO grantDTO){
        Integer Roleid = Integer.valueOf(grantDTO.getRoleid());
        grantDTO.setRoleid(Roleid);
        rightService.grantMenu(grantDTO);
        return new R(ResponseEnum.SUCCESS,null);
    }

    /**
     * 根据父类id 查询所有动作权限
     *  层级格式返回
     */
    @GetMapping("/actions")
   // @CheckLogin
    public R selectActionRightByParentId(){
        List<MenuDTO> menuDTOS = rightService.selectActionRightByParentId();
        return new R(ResponseEnum.SUCCESS,menuDTOS);
    }
    /**
     * g根据角色id获得拥有的权限id的集合
     * 包含父节点
     */
    @GetMapping("/grantAction/{roleid}")
  //  @CheckLogin
    public R selectActionRightidsByRoleId(@PathVariable("roleid") Integer roleid){
        List<Integer> integers = rightService.selectActionRightidsByRoleId(roleid);
        return new R(ResponseEnum.SUCCESS,integers);
    }

    /**
     * 给指定的角色赋权 菜单赋权
     */
    @PutMapping("/grant/action")
   // @CheckLogin
    public R grantActionRights(@RequestBody GrantDTO grantDTO){
        Integer Roleid = Integer.valueOf(grantDTO.getRoleid());
        grantDTO.setRoleid(Roleid);
        rightService.grantActionRights(grantDTO);
        return new R(ResponseEnum.SUCCESS,null);
    }
}
