package com.qf.rbac.service.memberimpl;

import com.qf.rbac.entity.User;
import com.qf.rbac.entity.member.AppletUserinfo;
import com.qf.rbac.mapper.member.AppletUserinfoMapper;
import com.qf.rbac.service.member.AppletUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.AutoPopulatingList;

import java.util.List;

@Service
public class AppletUserinfoServiceimpl implements AppletUserinfoService {

    @Autowired
    public AppletUserinfoMapper appletUserinfoMapper;


    //查询会员信息
    @Override
    public List<AppletUserinfo> selectAppletUser(Long userid) {
        List<AppletUserinfo> appletUserinfos=appletUserinfoMapper.selectAppletUser(userid);
        return appletUserinfos;
    }

    @Override
    public List<AppletUserinfo> selectAppletUserName(String username) {
        return appletUserinfoMapper.selectAppletUserName(username);
    }

    //新增会员信息
    @Override
    public int insertSelective(AppletUserinfo record) {
        return appletUserinfoMapper.insertSelective(record);
    }

    //根据会员id删除
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return appletUserinfoMapper.deleteByPrimaryKey(id);
    }

    //修改会员信息
    @Override
    public int updateByPrimaryKeySelective(AppletUserinfo record) {
        return appletUserinfoMapper.updateByPrimaryKeySelective(record);
    }
}
