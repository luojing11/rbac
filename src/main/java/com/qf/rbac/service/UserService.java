package com.qf.rbac.service;

import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.Role;
import com.qf.rbac.entity.RoleExample;
import com.qf.rbac.entity.User;
import com.qf.rbac.entity.UserExample;
import com.qf.rbac.entity.dto.UserDTO;
import com.qf.rbac.mapper.RoleMapper;
import com.qf.rbac.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;


    //根据登录用户的名字去查id
    public User selectUser(String name) {
        return userMapper.selectUser(name);
    }

    /**
     * 账号密码登录
     * @param userName
     * @param password
     * @return
     */
    public User login(String userName, String password){
        //1 用户名
//        System.out.println("当前登录用户；"+userName);
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(userExample);
        if (users == null || users.size()==0){
            throw new AppException(ResponseEnum.USER_NOT_FOUND);
        }
        // 2 状态
        User user = users.get(0);
        if (user.getIsDeleted()==2){
            throw new AppException(ResponseEnum.USER_IS_DELETE);
        }
        // 3 密码
        String encodeStr= DigestUtils.md5DigestAsHex(password.getBytes());
//        System.out.println(encodeStr);
        if(user.getUserPassword().equals(encodeStr)==false){
            throw new AppException(ResponseEnum.USERNAME_OR_PASSWORD_INVALIDATE);
        }
        // 返回
        return user;
    }

    /**
     * 根据用户id获取用户信息
     */
    public User getUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询所有的user 信息
     */
    public List<UserDTO> selectAllUser(){
        List<UserDTO> userDTOS = userMapper.selectAllUser();
        return userDTOS;
    }

    /**
     * 查询出user表 所有的roleid
     */
    public List<UserDTO> getUserRoleId(){
        return userMapper.getUserRoleId();
    }


    /**
     * 根据输入条件查询
     */
    public List<UserDTO> queryByInputCondition(Long phone, Integer roleid,Boolean isvip){
      List<UserDTO> userDTOS = userMapper.selectUserDtoByInput(phone,roleid,isvip);
        if (userDTOS==null || userDTOS.size()==0){
            throw new AppException(ResponseEnum.NO_QUERY_INFOMATION);
        }
        return userDTOS;
    }



    /**
     * 修改用户角色信息
     */
    public void updateRolesById(Long id,String rolename){
        // 获得当前用户
        User nowuser = userMapper.selectByPrimaryKey(id);
        // 根据当前用户查询 roleid
        Integer roleid = nowuser.getRoleid();
        //更新
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria()
                .andRolenameEqualTo(rolename);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        Role role = roles.get(0);
        Integer updateRoleId = role.getRoleid();
        //
        User user = User.builder().id(id).roleid(updateRoleId)
                .roles(rolename).build();
        userMapper.updateByPrimaryKeySelective(user);
    }

    /**
     * updateRoleInfo  测试
     */
    public void updateRoleInfo(Long id,Integer roleid,String rolename){
//        // 获得当前用户
//        User nowuser = userMapper.selectByPrimaryKey(id);
//        // 根据当前用户查询 roleid
//        Integer roleid = nowuser.getRoleid();
//        //根据角色id更新
//        roleMapper.updateRoleNameByRoleId(roleid,rolename);
        userMapper.updateRoleInfo(id,roleid,rolename);

    }

}
