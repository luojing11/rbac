package com.qf.rbac.entity.commodity;

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
public class GoodsList {
    private Integer id;

    private String goodsName;

    private String goodsintroduce;

    private String goodsimg;

    private Integer type;

    private Integer price;

    private Integer inventory;

    private Integer detailId;

    private Integer putaway;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date putawaytime;

    private String goodsnumber;

    private Integer mchId;

    private Integer salesnum;

    private Integer showId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getGoodsintroduce() {
        return goodsintroduce;
    }

    public void setGoodsintroduce(String goodsintroduce) {
        this.goodsintroduce = goodsintroduce;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Date getPutawaytime() {
        return putawaytime;
    }

    public void setPutawaytime(Date putawaytime) {
        this.putawaytime = putawaytime;
    }

    public String getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(String goodsnumber) {
        this.goodsnumber = goodsnumber;
    }

    public Integer getMchId() {
        return mchId;
    }

    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    public Integer getSalesnum() {
        return salesnum;
    }

    public void setSalesnum(Integer salesnum) {
        this.salesnum = salesnum;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getPutaway() {
        return putaway;
    }

    public void setPutaway(Integer putaway) {
        this.putaway = putaway;
    }




}