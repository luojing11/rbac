package com.qf.rbac.mapper.commodity;

import com.qf.rbac.entity.commodity.AddressList;
import com.qf.rbac.entity.commodity.AddressListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressListMapper {
    long countByExample(AddressListExample example);

    int deleteByExample(AddressListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AddressList record);

    int insertSelective(AddressList record);

    List<AddressList> selectByExample(AddressListExample example);

    AddressList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AddressList record, @Param("example") AddressListExample example);

    int updateByExample(@Param("record") AddressList record, @Param("example") AddressListExample example);

    int updateByPrimaryKeySelective(AddressList record);

    int updateByPrimaryKey(AddressList record);
}