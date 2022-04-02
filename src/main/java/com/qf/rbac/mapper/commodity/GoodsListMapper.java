package com.qf.rbac.mapper.commodity;

import com.qf.rbac.entity.commodity.GoodsList;
import com.qf.rbac.entity.commodity.GoodsListExample;
import java.util.List;
import java.util.Map;

import com.qf.rbac.entity.dto.GoodsListDTO;
import org.apache.ibatis.annotations.Param;

public interface GoodsListMapper {


    List<GoodsListDTO> selectPrice();

    //查询根据商户id查询对应的商品信息
    List<GoodsListDTO> selectGoodsListDTO(Integer id);
    //根据条件查询商品信息
    List<GoodsListDTO> selectQuery(String goodsName,String goodsNumber,Integer putaway,Integer type);

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


    long countByExample(GoodsListExample example);

    int deleteByExample(GoodsListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsList record);

    int insertSelective(GoodsList record);

    List<GoodsList> selectByExample(GoodsListExample example);

    GoodsList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsList record, @Param("example") GoodsListExample example);

    int updateByExample(@Param("record") GoodsList record, @Param("example") GoodsListExample example);

    int updateByPrimaryKeySelective(GoodsList record);

    int updateByPrimaryKey(GoodsList record);
}