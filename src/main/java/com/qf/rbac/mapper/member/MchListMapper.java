package com.qf.rbac.mapper.member;

import com.qf.rbac.entity.member.MchList;
import com.qf.rbac.entity.member.MchListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MchListMapper {
    //根据商户名查询
    List<MchList> selectWhereMchlist(String addName);

    //查询商户所有信息
    List<MchList> selectMcList(int id);

    /**
     * 根据id实现批量删除
     * @param id
     * @return
     */
    int deleteMclistAllById(List<String> id);


    long countByExample(MchListExample example);

    int deleteByExample(MchListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MchList record);

    int insertSelective(MchList record);

    List<MchList> selectByExample(MchListExample example);

    MchList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MchList record, @Param("example") MchListExample example);

    int updateByExample(@Param("record") MchList record, @Param("example") MchListExample example);

    int updateByPrimaryKeySelective(MchList record);

    int updateByPrimaryKey(MchList record);
}