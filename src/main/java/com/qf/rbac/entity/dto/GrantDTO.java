package com.qf.rbac.entity.dto;

import lombok.Data;

import java.util.List;

@Data
public class GrantDTO {

    private Integer roleid;

    private List<Integer> rights;

}
