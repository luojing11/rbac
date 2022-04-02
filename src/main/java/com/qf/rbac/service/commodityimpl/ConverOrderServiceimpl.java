package com.qf.rbac.service.commodityimpl;

import com.qf.rbac.entity.dto.ConverOrderDTO;
import com.qf.rbac.mapper.commodity.ConverOrderMapper;
import com.qf.rbac.service.commodity.ConverOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class ConverOrderServiceimpl implements ConverOrderService {

    @Autowired
    private ConverOrderMapper converOrderMapper;

    @Override
    public int updateConverOrder(Integer stall, Integer id) {
        return converOrderMapper.updateConverOrder(stall,id);
    }

    @Override
    public List<ConverOrderDTO> selectConverOrder(Integer id) {
        return converOrderMapper.selectConverOrder(id);
    }

    @Override
    public List<ConverOrderDTO> selectLikeConverOrder(String username, Integer statuss, String ordertime) {
        return converOrderMapper.selectLikeConverOrder(username,statuss,ordertime);
    }
}
