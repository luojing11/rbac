package com.qf.rbac.service.commodityimpl;

import com.qf.rbac.entity.commodity.GoodsList;
import com.qf.rbac.entity.dto.GoodsListDTO;
import com.qf.rbac.mapper.commodity.GoodsListMapper;
import com.qf.rbac.service.commodity.GoodsListService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsListServiceimpl implements GoodsListService {

    @Autowired
    public GoodsListMapper goodsListMapper;


    @Override
    public List<GoodsListDTO> selectPrice() {
        return goodsListMapper.selectPrice();
    }

    @Override
    public int deleteUserAllById(List<String> id) {
        //创建一个map对象，map里面有个list集合
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("id",id );
        return goodsListMapper.deleteUserAllById(id);
    }

    @Override
    public int updateAppGoodsDetailsByIds(Map<String, Object> map) {
        return goodsListMapper.updateAppGoodsDetailsByIds(map);
    }


    @Override
    public List<GoodsListDTO> selectGoodsListDTO(Integer id) {
        return goodsListMapper.selectGoodsListDTO(id);
    }

    @Override
    public List<GoodsListDTO> selectQuery(String goodsName, String goodsNumber, Integer putaway, Integer type) {
        return goodsListMapper.selectQuery(goodsName,goodsNumber,putaway,type);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        goodsListMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(GoodsList record) {
        goodsListMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public int insertSelective(GoodsList record) {
        goodsListMapper.insertSelective(record);
        return 0;
    }


}
