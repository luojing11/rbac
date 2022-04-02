package com.qf.rbac.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.rbac.entity.dto.UserDTO;
import com.qf.rbac.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagingService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 分页
     */
    public PageInfo<UserDTO> findAllByPage(Integer pageNum, Integer pageSize,
                                           Long phone,Integer roleid,Boolean isvip) {
            // 设置分页参数; pageNum:页码, pageSize:每页大小
            PageHelper.startPage(pageNum,pageSize);
            // 执行sql查询方法查询所有数据, 会自动分页
            List<UserDTO> list = userMapper.selectAllUserByInput(phone,roleid,isvip);
            return new PageInfo<UserDTO>(list);
    }

}
