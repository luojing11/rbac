package com.qf.rbac.mapper.member;

import com.qf.rbac.entity.member.AppletUserinfo;
import com.qf.rbac.entity.member.AppletUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppletUserinfoMapper {

   //查询会员信息
    List<AppletUserinfo>  selectAppletUser(Long userid);
    //根据会员名查询信息
    List<AppletUserinfo>  selectAppletUserName(String username);

    long countByExample(AppletUserinfoExample example);

    int deleteByExample(AppletUserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppletUserinfo record);

    int insertSelective(AppletUserinfo record);

    List<AppletUserinfo> selectByExample(AppletUserinfoExample example);

    AppletUserinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppletUserinfo record, @Param("example") AppletUserinfoExample example);

    int updateByExample(@Param("record") AppletUserinfo record, @Param("example") AppletUserinfoExample example);

    int updateByPrimaryKeySelective(AppletUserinfo record);

    int updateByPrimaryKey(AppletUserinfo record);
}