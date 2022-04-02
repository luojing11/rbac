package com.qf.rbac.service;

import com.qf.rbac.entity.*;
import com.qf.rbac.entity.dto.GrantDTO;
import com.qf.rbac.entity.dto.MenuDTO;
import com.qf.rbac.mapper.RoleActionRightMapper;
import com.qf.rbac.mapper.RoleRightMapper;
import com.qf.rbac.mapper.RrightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RightService {

    @Autowired
    private RoleRightMapper roleRightMapper;

    @Autowired
    private RrightMapper rrightMapper;

    @Autowired
    private RoleActionRightMapper roleActionRightMapper;

    /**
     * 根据角色id 获取角色的动作权限码
     */
    public List<String> selectRightCodesByRoleId(Integer roleid){
        return roleRightMapper.selectRightCodesByRoleId(roleid);
    }

    /**
     * 根据父类id 获得菜单权限
     */
    @Transactional
    public List<MenuDTO> selectMenuRightByParentId(){
        // 父类id为0的菜单  第一层
        List<MenuDTO> menuDTOS = rrightMapper.selectRightsByParentid(0);
        // 判断
        if (menuDTOS != null || menuDTOS.size() > 0){
            // 找出第一层的儿子
            for (MenuDTO menuDTO : menuDTOS) {
                // 获得父类的权限id
                Integer parentid = menuDTO.getRightid();
                List<MenuDTO> menuDTOS1 = rrightMapper.selectRightsByParentid(parentid);
                menuDTO.setChildren(menuDTOS1);
            }
        }

        return menuDTOS;
    }

    /**
     * 根据角色id获得拥有的权限
     */
    @Transactional
    public List<Integer> selectRightidsByRoleIdNoParent(Integer roleid){
        return rrightMapper.selectRightidsByRoleIdNoParent(roleid);
    }

    /**
     *  根据选择的权限id 修改权限
     */
    @Transactional
    public void grantMenu(GrantDTO grantDTO){
        //
        RoleRightExample roleRightExample = new RoleRightExample();
        roleRightExample.createCriteria()
                .andRoleidEqualTo(grantDTO.getRoleid());
         roleRightMapper.deleteByExample(roleRightExample);
         //
        List<Integer> rights = grantDTO.getRights();

        for (int i = 0; i < rights.size(); i++) {
            RoleRight roleRight = new RoleRight();
            roleRight.setRoleid(grantDTO.getRoleid());
            roleRight.setRightid(rights.get(i));
            roleRightMapper.insertSelective(roleRight);
        }
    }

    /**
     * 根据父类id 获得动作权限
     */
    @Transactional
    public List<MenuDTO> selectActionRightByParentId(){
        // 父类id为0的菜单  第一层
        List<MenuDTO> menuDTOS = roleActionRightMapper.selectActionRightsByParentid(0);
        // 判断
        if (menuDTOS != null || menuDTOS.size() > 0){
            // 找出第一层的儿子
            for (MenuDTO menuDTO : menuDTOS) {
                // 获得父类的权限id
                Integer parentid = menuDTO.getRightid();
                List<MenuDTO> menuDTOS1 = roleActionRightMapper.selectActionRightsByParentid(parentid);
                menuDTO.setChildren(menuDTOS1);
            }
        }
        return menuDTOS;
    }

    /**
     * 根据角色id获得拥有的动作权限
     */
    @Transactional
    public List<Integer> selectActionRightidsByRoleId(Integer roleid){
        return roleActionRightMapper.selectActionRightidsByRoleId(roleid);
    }

    /**
     *  根据选择的权限id 修改动作权限
     */
    @Transactional
    public void grantActionRights(GrantDTO grantDTO){
        //
        RoleActionRightExample roleActionRightExample = new RoleActionRightExample();
        roleActionRightExample.createCriteria()
                .andRoleidEqualTo(grantDTO.getRoleid());
        roleActionRightMapper.deleteByExample(roleActionRightExample);
        //
        List<Integer> rights = grantDTO.getRights();

        for (int i = 0; i < rights.size(); i++) {
            RoleActionRight roleActionRight = new RoleActionRight();
            roleActionRight.setRoleid(grantDTO.getRoleid());
            roleActionRight.setRightid(rights.get(i));
            roleActionRightMapper.insertSelective(roleActionRight);
        }
    }
}
