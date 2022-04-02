package com.qf.rbac.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConverOrderDTO {

   private String  orderid;

   private String  username;

   private Integer statuss;

   private  Integer goodsnum;

   private String ordertime;
}
