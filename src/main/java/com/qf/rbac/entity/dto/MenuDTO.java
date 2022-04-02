package com.qf.rbac.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuDTO {

    private Integer rightid;

    private String righttext;

    private Integer righttype;

    private String righturl;

    private Integer parentid;

    private List<MenuDTO> children;

}
