package com.qf.rbac.entity.dto;

import com.qf.rbac.entity.commodity.GoodsList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsListDTO {
    private Long id;

    private String goodsName;

    private String goodsIntroduce;

    private String goodsImg;

    private Integer type;

    private Integer price;

    private Integer inventory;

    private Integer detailId;

    private Integer putaway;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date putawayTime;

    private String goodsNumber;

    private Integer mchId;

    private Integer salesNum;

    private Integer showId;

    private String Imgurl;

    private String headImg;

   // private Map<GoodsListDTO,GoodsListDTO> map=new HashMap<GoodsListDTO,GoodsListDTO>();

}
