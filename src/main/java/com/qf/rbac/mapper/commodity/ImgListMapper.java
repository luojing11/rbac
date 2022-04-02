package com.qf.rbac.mapper.commodity;

import com.qf.rbac.entity.commodity.ImgList;
import com.qf.rbac.entity.commodity.ImgListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgListMapper {

    long countByExample(ImgListExample example);

    int deleteByExample(ImgListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImgList record);

    int insertSelective(ImgList record);

    List<ImgList> selectByExample(ImgListExample example);

    ImgList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImgList record, @Param("example") ImgListExample example);

    int updateByExample(@Param("record") ImgList record, @Param("example") ImgListExample example);

    int updateByPrimaryKeySelective(ImgList record);

    int updateByPrimaryKey(ImgList record);
}