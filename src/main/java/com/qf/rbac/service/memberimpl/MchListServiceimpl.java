package com.qf.rbac.service.memberimpl;

import com.qf.rbac.entity.member.MchList;
import com.qf.rbac.mapper.member.MchListMapper;
import com.qf.rbac.service.member.MchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MchListServiceimpl implements MchListService {

    @Autowired
    public MchListMapper mchListMapper;


    @Override
    public List<MchList> selectMcList(int id) {
        List<MchList> mchLists=mchListMapper.selectMcList(id);
        return mchLists;
    }


    @Override
    public List<MchList> selectWhereMchlist(String addName) {
        return mchListMapper.selectWhereMchlist(addName);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int m=mchListMapper.deleteByPrimaryKey(id);
        return m;
    }

    @Override
    public int insert(MchList record) {
        return mchListMapper.insert(record);
    }

    @Override
    public int insertSelective(MchList record) {
        return mchListMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(MchList record) {
        return mchListMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MchList record) {
        return mchListMapper.updateByPrimaryKey(record);
    }

    @Override
    public int deleteMclistAllById(List<String> id) {
        return mchListMapper.deleteMclistAllById(id);
    }


}
