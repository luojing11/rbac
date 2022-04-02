package com.qf.rbac.mapper.commodity;

import com.qf.rbac.entity.commodity.ConverOrder;
import com.qf.rbac.entity.commodity.ConverOrderExample;


import java.util.Date;
import java.util.List;

import com.qf.rbac.entity.dto.ConverOrderDTO;
import org.apache.ibatis.annotations.Param;

public interface ConverOrderMapper {
    //修改订单状态
    int updateConverOrder(Integer stall,Integer id);
    //查询订单
    List<ConverOrderDTO> selectConverOrder(Integer id);

    //根据条件查询
    List<ConverOrderDTO> selectLikeConverOrder(String username, Integer statuss, String ordertime);

    long countByExample(ConverOrderExample example);

    int deleteByExample(ConverOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConverOrder record);

    int insertSelective(ConverOrder record);

    List<ConverOrder> selectByExample(ConverOrderExample example);

    ConverOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConverOrder record, @Param("example") ConverOrderExample example);

    int updateByExample(@Param("record") ConverOrder record, @Param("example") ConverOrderExample example);

    int updateByPrimaryKeySelective(ConverOrder record);

    int updateByPrimaryKey(ConverOrder record);
}