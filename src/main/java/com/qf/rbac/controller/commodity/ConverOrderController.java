package com.qf.rbac.controller.commodity;


import com.qf.rbac.common.aop.annotation.CurrentUser;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.SysUser;
import com.qf.rbac.entity.SysUserExample;
import com.qf.rbac.entity.dto.ConverOrderDTO;
import com.qf.rbac.entity.dto.GoodsListDTO;
import com.qf.rbac.mapper.SysUserMapper;
import com.qf.rbac.service.commodity.ConverOrderService;
import com.qf.rbac.service.commodity.GoodsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/conver")
public class ConverOrderController {

    @Autowired
    private ConverOrderService converOrderService;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private GoodsListService goodsListService;

    @GetMapping("/query")
    public R selectConverOrder(HttpSession session){
//        String username=(String)session.getAttribute("username");
//        System.out.println(username);
//        SysUser sysUser=sysUserMapper.selectUser(username);
        List<ConverOrderDTO> converOrderDTOS=converOrderService.selectConverOrder(1);
        List<GoodsListDTO> goodsListDTOS=goodsListService.selectPrice();
        //计算价格
        int a = 0;
        for (int i = 0; i < converOrderDTOS.size(); i++) {
            for (int j = 0; j<goodsListDTOS.size(); j++) {
                System.out.println(goodsListDTOS.get(i).getPrice());
                a=goodsListDTOS.get(i).getPrice();
            }
            converOrderDTOS.get(i).setGoodsnum(converOrderDTOS.get(i).getGoodsnum()*a);

        }
        return new R(ResponseEnum.SUCCESS,converOrderDTOS);
    }

    //模糊查询订单
    @PostMapping("/querylike")
    public R selectQuery(String username, Integer statuss, String ordertime){
        List<ConverOrderDTO> selectQuery=converOrderService.selectLikeConverOrder(username,statuss,ordertime);
        return new R(ResponseEnum.SUCCESS,selectQuery);
    }

    @PostMapping("/update")
    public R updadeConverOrder(Integer stall,Integer id){
        return new R(ResponseEnum.SUCCESS,converOrderService.updateConverOrder(stall,id));
    }

}
