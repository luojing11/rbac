package com.qf.rbac.mapper;

import com.qf.rbac.entity.RoleActionRight;
import com.qf.rbac.entity.RoleActionRightExample;
import com.qf.rbac.entity.dto.MenuDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleActionRightMapper {
    int countByExample(RoleActionRightExample example);

    int deleteByExample(RoleActionRightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleActionRight record);

    int insertSelective(RoleActionRight record);

    List<RoleActionRight> selectByExample(RoleActionRightExample example);

    RoleActionRight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleActionRight record, @Param("example") RoleActionRightExample example);

    int updateByExample(@Param("record") RoleActionRight record, @Param("example") RoleActionRightExample example);

    int updateByPrimaryKeySelective(RoleActionRight record);

    int updateByPrimaryKey(RoleActionRight record);

    List<MenuDTO> selectActionRightsByParentid(@Param("parentid") Integer parentid);

    /**
     *  根据角色id 查询出 这个角色的拥有的权限id的集合 不包含父节点
     */
    List<Integer> selectActionRightidsByRoleId(@Param("roleid") Integer roleid);
}