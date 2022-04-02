package com.qf.rbac.service;

import com.qf.rbac.entity.User;
import com.qf.rbac.entity.UserExample;
import com.qf.rbac.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class InfoEditService {

    @Autowired
    private UserMapper userMapper;

    /**
     * userName: 客户端填写的 需要验证的用户名
     * id：  当前登录用户
     *  返回true: 可以注册 false: 不能注册
     */
    public boolean checkUserName(String userName,Long id){

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName)
                .andIdNotEqualTo(id);
        // 查询用户名字是否已存在
        int i = userMapper.countByExample(userExample);
        //
        return i==0;

    }

    /**
     * 更新用户信息
     */
    public void updateUserInfo(User user){
        //  密码加密
        String password = user.getUserPassword();
//        System.out.println("service当前密码："+password);
        String encodeStr= DigestUtils.md5DigestAsHex(password.getBytes());
//        System.out.println("service加密："+encodeStr);

        user.setUserPassword(encodeStr);

        userMapper.updateByPrimaryKeySelective(user);
    }

}
