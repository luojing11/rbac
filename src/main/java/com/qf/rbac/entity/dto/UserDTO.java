package com.qf.rbac.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;

    private Long phone;

    private Integer roleid;

    private String roles;

    private Integer bonus;

    private Boolean isvip;

    private String rolename;

    private Boolean flag=true;

    private Integer pageNum;
    private Integer pageSize;
}
