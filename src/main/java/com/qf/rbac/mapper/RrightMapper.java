package com.qf.rbac.mapper;

import com.qf.rbac.entity.Rright;
import com.qf.rbac.entity.RrightExample;
import com.qf.rbac.entity.dto.MenuDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RrightMapper {
    int countByExample(RrightExample example);

    int deleteByExample(RrightExample example);

    int deleteByPrimaryKey(Integer rightid);

    int insert(Rright record);

    int insertSelective(Rright record);

    List<Rright> selectByExample(RrightExample example);

    Rright selectByPrimaryKey(Integer rightid);

    int updateByExampleSelective(@Param("record") Rright record, @Param("example") RrightExample example);

    int updateByExample(@Param("record") Rright record, @Param("example") RrightExample example);

    int updateByPrimaryKeySelective(Rright record);

    int updateByPrimaryKey(Rright record);

    List<MenuDTO> selectMenuByRoleIdAndParentId(@Param("roleid") Integer roleid,
                                                @Param("parentid") Integer parentid);

    List<MenuDTO> selectRightsByParentid(@Param("parentid") Integer parentid);

    /**
     *  根据角色id 查询出 这个角色的拥有的权限id的集合 不包含父节点
     */
    List<Integer> selectRightidsByRoleIdNoParent(@Param("roleid") Integer roleid);

}