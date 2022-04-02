package com.qf.rbac.service;

import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.Role;
import com.qf.rbac.entity.RoleExample;
import com.qf.rbac.entity.dto.MenuDTO;
import com.qf.rbac.mapper.RoleMapper;
import com.qf.rbac.mapper.RrightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RrightMapper rightMapper;

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 根据角色id查询菜单权限
     */
    public List<MenuDTO> selectMenusByRoleid(Integer roleid){
        // 第一层
        List<MenuDTO> menuDTOS = rightMapper.selectMenuByRoleIdAndParentId(roleid,0);

        // 判断
        if (menuDTOS==null || menuDTOS.size()==0){
            throw new AppException(ResponseEnum.ROLE_NO_RIGHT);
        }
        // 找出第一层的儿子
        for (MenuDTO menuDTO : menuDTOS) {
            // 获得下一层的父亲id
            Integer parentid = menuDTO.getRightid();

            List<MenuDTO> children = rightMapper.selectMenuByRoleIdAndParentId(roleid, parentid);
            menuDTO.setChildren(children);
        }
        // 返回
        return menuDTOS;
    }

    /**
     * 查询出所有角色
     */
    public List<Role> getAllRole(){
        return roleMapper.selectByExample(null);
    }

    /**
     * 验证输入是否为空 角色名字是否存在
     * 添加角色
     */
    public void addAndCheckRole(Role role){
        // 验证输入是否为空
        if (role.getRolename()==null){
            throw new AppException(ResponseEnum.NOT_PRINT);
        }
        // 验证角色是否存在
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria()
                .andRolenameEqualTo(role.getRolename());
        List<Role> roles = roleMapper.selectByExample(roleExample);
        // 判断角色名字存在
        if (roles == null || roles.size() == 0){
            roleMapper.insert(role);
        }else {
            throw new AppException(ResponseEnum.ROLE_ALREADY_EXIST);
        }
    }

    /**
     * 删除角色
     * @param roleid
     */
    public void deleteRole(Integer roleid){
//        Integer roleid = role.getRoleid();
        roleMapper.deleteByPrimaryKey(roleid);
    }

}
