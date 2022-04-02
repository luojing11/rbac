package com.qf.rbac.service.commodity;

import com.qf.rbac.entity.dto.ConverOrderDTO;


import java.util.Date;
import java.util.List;

public interface ConverOrderService {
    //修改订单状态
    int updateConverOrder(Integer stall,Integer id);

    //查询订单
    List<ConverOrderDTO> selectConverOrder(Integer id);

    //根据条件查询
    List<ConverOrderDTO> selectLikeConverOrder(String username, Integer statuss, String ordertime);
}
