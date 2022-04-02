package com.qf.rbac.controller.member;

import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.entity.member.AppletUserinfo;
import com.qf.rbac.entity.member.MchList;
import com.qf.rbac.service.UserService;
import com.qf.rbac.service.member.MchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mchlist")
public class MchListController {

     @Autowired
     public MchListService mchListService;

     @Autowired
     public UserService userService;

     //查询商户信息
    @GetMapping("/list")
    public R selectMchList(){
        List<MchList> mchLists=mchListService.selectMcList(1);
        return new R(ResponseEnum.SUCCESS,mchLists);
    }

    //根据商户名条件查询


    //根据id删除商户
    @PostMapping("/delect")
    public R delectMchList(Integer id){
        int m=mchListService.deleteByPrimaryKey(id);
        return new R(ResponseEnum.SUCCESS,m);

    }

    //添加商户
    @PostMapping("/insert")
    public R insertMchList(@RequestBody MchList mchList){
        int m=mchListService.insertSelective(mchList);
        return new R(ResponseEnum.SUCCESS,m);

    }
    //修改商户
    @PostMapping("/update")
    public  R updateMchList(@RequestBody MchList mchList){
        return new R(ResponseEnum.SUCCESS,mchListService.updateByPrimaryKey(mchList));
    }

}
