package com.qf.rbac.service.commodity;

import com.qf.rbac.entity.commodity.GoodsList;
import com.qf.rbac.entity.dto.GoodsListDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsListService {
    List<GoodsListDTO> selectPrice();

    /**
     * 根据id实现批量删除
     * @param id
     * @return
     */
    int deleteUserAllById(List<String> id);

    /**
     * 批量上下架商品
     * @return 结果
     */
    public int updateAppGoodsDetailsByIds(Map<String,Object> map);

    //根据商户id查询对应的商品信息
    List<GoodsListDTO> selectGoodsListDTO(Integer id);

    //根据条件查询商品信息
    List<GoodsListDTO> selectQuery(String goodsName,String goodsNumber,Integer putaway,Integer type);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKey(GoodsList record);

    int insertSelective(GoodsList record);
}
