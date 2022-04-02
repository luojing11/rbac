package com.qf.rbac.service;

import com.qf.rbac.common.exception.AppException;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.SysUser;
import com.qf.rbac.entity.SysUserExample;
import com.qf.rbac.entity.User;
import com.qf.rbac.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;


@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 账号密码登录
     * @param userName
     * @param password
     * @return
     */

    public SysUser login2(String userName, String password){
        //1 用户名
//        System.out.println("当前登录用户；"+userName);
        SysUserExample sysUserExampler = new SysUserExample();
        sysUserExampler.createCriteria().andUsernameEqualTo(userName);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExampler);
        if (sysUsers == null || sysUsers.size()==0){
            throw new AppException(ResponseEnum.USER_NOT_FOUND);
        }
        // 2 状态
        SysUser sysuser = sysUsers.get(0);
        if (sysuser.getStatus()==0){
            throw new AppException(ResponseEnum.USER_IS_DELETE);
        }
        // 3 密码
        String encodeStr= DigestUtils.md5DigestAsHex(password.getBytes());
//        System.out.println(encodeStr);
        if(sysuser.getPassword().equals(encodeStr)==false){
            throw new AppException(ResponseEnum.USERNAME_OR_PASSWORD_INVALIDATE);
        }
        // 返回
        return sysuser;
    }


    public   SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public SysUser selectUser(String name) {
        return sysUserMapper.selectUser(name);
    }

    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    //修改密码
    public SysUser updateUser(String username, String passwprd) {
        System.out.println("当前登录用户；"+username);
        SysUserExample sysUserExampler = new SysUserExample();
        sysUserExampler.createCriteria().andUsernameEqualTo(username);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExampler);
        if (sysUsers == null || sysUsers.size()==0){
            throw new AppException(ResponseEnum.USER_NOT_FOUND);
        }
        // 2 状态
        SysUser sysuser = sysUsers.get(0);
        if (sysuser.getStatus()==0){
            throw new AppException(ResponseEnum.USER_IS_DELETE);
        }
        // 3 密码
        String encodeStr= DigestUtils.md5DigestAsHex(passwprd.getBytes());
//        System.out.println(encodeStr);
        if(sysuser.getPassword().equals(encodeStr)==false){
            throw new AppException(ResponseEnum.USERNAME_OR_PASSWORD_INVALIDATE);
        }
        // 返回
        return sysuser;
    }

    public SysUser changePassword(String username, String newpassword) {
        return sysUserMapper.changePassword(username,newpassword);
    }
}
