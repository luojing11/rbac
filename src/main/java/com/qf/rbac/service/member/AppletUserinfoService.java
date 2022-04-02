package com.qf.rbac.service.member;

import com.qf.rbac.entity.member.AppletUserinfo;

import java.util.List;


public interface AppletUserinfoService {
    //查询会员信息
    List<AppletUserinfo> selectAppletUser(Long userid);

    //根据会员名查询信息
    List<AppletUserinfo>  selectAppletUserName(String username);

    int insertSelective(AppletUserinfo record);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppletUserinfo record);

}
