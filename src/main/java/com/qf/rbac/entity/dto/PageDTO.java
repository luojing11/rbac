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
public class PageDTO {

    private String start;

    private String pageNum;

    private String pageSize;

    private List<UserDTO> user;
}
