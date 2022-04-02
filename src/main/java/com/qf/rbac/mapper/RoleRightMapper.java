package com.qf.rbac.mapper;

import com.qf.rbac.entity.RoleRight;
import com.qf.rbac.entity.RoleRightExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRightMapper {
    int countByExample(RoleRightExample example);

    int deleteByExample(RoleRightExample example);

    int deleteByPrimaryKey(Integer rrid);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    List<RoleRight> selectByExample(RoleRightExample example);

    RoleRight selectByPrimaryKey(Integer rrid);

    int updateByExampleSelective(@Param("record") RoleRight record, @Param("example") RoleRightExample example);

    int updateByExample(@Param("record") RoleRight record, @Param("example") RoleRightExample example);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);

    List<String> selectRightCodesByRoleId(@Param("roleid") Integer roleid);
}