package com.qf.rbac.controller.admin;

import com.qf.rbac.common.aop.annotation.CheckRight;
import com.qf.rbac.common.result.R;
import com.qf.rbac.common.result.ResponseEnum;
import com.qf.rbac.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin/right/test")
public class AdminTestController {

    @Autowired
    private RightService rightService;

    /**
     * 测试查询接口
     */
    @GetMapping("/search/check")
    @CheckRight(value = "TEST_SEARCH")
    public R testSearch(Integer roleid){
        return new R(ResponseEnum.SUCCESS,null);
    }

    /**
     * 测试审批接口
     */
    @GetMapping("/audit/check")
    @CheckRight(value = "TEST_AUDIT")
    public R testAudit(){
        return new R(ResponseEnum.SUCCESS,null);
    }
}
