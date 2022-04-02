package com.qf.rbac.entity.commodity;

public class ConverOrder {
    private Integer id;

    private Integer addressId;

    private Integer mchId;

    private String orderId;

    private String orderTime;

    private Integer statuss;

    private Integer goodsId;

    private Integer goodsNum;

    private String logistics;

    private String logisticsNum;

    private Integer userId;

    private String orderRemark;

    private Integer zPrice;

    private Integer type;

    private Integer isLogistics;

    private String orderNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getMchId() {
        return mchId;
    }

    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public Integer getStatuss() {
        return statuss;
    }

    public void setStatuss(Integer statuss) {
        this.statuss = statuss;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics == null ? null : logistics.trim();
    }

    public String getLogisticsNum() {
        return logisticsNum;
    }

    public void setLogisticsNum(String logisticsNum) {
        this.logisticsNum = logisticsNum == null ? null : logisticsNum.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public Integer getzPrice() {
        return zPrice;
    }

    public void setzPrice(Integer zPrice) {
        this.zPrice = zPrice;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsLogistics() {
        return isLogistics;
    }

    public void setIsLogistics(Integer isLogistics) {
        this.isLogistics = isLogistics;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }
}