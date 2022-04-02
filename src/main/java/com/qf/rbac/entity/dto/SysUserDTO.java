package com.qf.rbac.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUserDTO {

    private Long userId;

    private String username;

    private Boolean flag=true;

    private Integer pageNum;
    private Integer pageSize;
}
