package com.qf.rbac.service.member;

import com.qf.rbac.entity.member.MchList;

import java.util.List;

public interface MchListService {
    //查询商户信息
    List<MchList> selectMcList(int id);

    //根据商户名查询
    List<MchList> selectWhereMchlist(String addName);

    int deleteByPrimaryKey(Integer id);

    int insert(MchList record);

    int insertSelective(MchList record);

    int updateByPrimaryKeySelective(MchList record);


    int updateByPrimaryKey(MchList record);

    /**
     * 根据id实现批量删除
     * @param id
     * @return
     */
    int deleteMclistAllById(List<String> id);
}
