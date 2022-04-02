package com.qf.rbac.mapper;

import com.qf.rbac.entity.ActionRight;
import com.qf.rbac.entity.ActionRightExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActionRightMapper {
    int countByExample(ActionRightExample example);

    int deleteByExample(ActionRightExample example);

    int deleteByPrimaryKey(Integer rightid);

    int insert(ActionRight record);

    int insertSelective(ActionRight record);

    List<ActionRight> selectByExample(ActionRightExample example);

    ActionRight selectByPrimaryKey(Integer rightid);

    int updateByExampleSelective(@Param("record") ActionRight record, @Param("example") ActionRightExample example);

    int updateByExample(@Param("record") ActionRight record, @Param("example") ActionRightExample example);

    int updateByPrimaryKeySelective(ActionRight record);

    int updateByPrimaryKey(ActionRight record);
}