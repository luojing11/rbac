package com.qf.rbac.entity.commodity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceIsNull() {
            addCriterion("goodsIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceIsNotNull() {
            addCriterion("goodsIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceEqualTo(String value) {
            addCriterion("goodsIntroduce =", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotEqualTo(String value) {
            addCriterion("goodsIntroduce <>", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceGreaterThan(String value) {
            addCriterion("goodsIntroduce >", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("goodsIntroduce >=", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceLessThan(String value) {
            addCriterion("goodsIntroduce <", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceLessThanOrEqualTo(String value) {
            addCriterion("goodsIntroduce <=", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceLike(String value) {
            addCriterion("goodsIntroduce like", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotLike(String value) {
            addCriterion("goodsIntroduce not like", value, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceIn(List<String> values) {
            addCriterion("goodsIntroduce in", values, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotIn(List<String> values) {
            addCriterion("goodsIntroduce not in", values, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceBetween(String value1, String value2) {
            addCriterion("goodsIntroduce between", value1, value2, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsintroduceNotBetween(String value1, String value2) {
            addCriterion("goodsIntroduce not between", value1, value2, "goodsintroduce");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIsNull() {
            addCriterion("goodsImg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIsNotNull() {
            addCriterion("goodsImg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimgEqualTo(String value) {
            addCriterion("goodsImg =", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotEqualTo(String value) {
            addCriterion("goodsImg <>", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThan(String value) {
            addCriterion("goodsImg >", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgGreaterThanOrEqualTo(String value) {
            addCriterion("goodsImg >=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThan(String value) {
            addCriterion("goodsImg <", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLessThanOrEqualTo(String value) {
            addCriterion("goodsImg <=", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgLike(String value) {
            addCriterion("goodsImg like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotLike(String value) {
            addCriterion("goodsImg not like", value, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgIn(List<String> values) {
            addCriterion("goodsImg in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotIn(List<String> values) {
            addCriterion("goodsImg not in", values, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgBetween(String value1, String value2) {
            addCriterion("goodsImg between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andGoodsimgNotBetween(String value1, String value2) {
            addCriterion("goodsImg not between", value1, value2, "goodsimg");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andPutawayIsNull() {
            addCriterion("putaway is null");
            return (Criteria) this;
        }

        public Criteria andPutawayIsNotNull() {
            addCriterion("putaway is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayEqualTo(Integer value) {
            addCriterion("putaway =", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotEqualTo(Integer value) {
            addCriterion("putaway <>", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayGreaterThan(Integer value) {
            addCriterion("putaway >", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("putaway >=", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayLessThan(Integer value) {
            addCriterion("putaway <", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayLessThanOrEqualTo(Integer value) {
            addCriterion("putaway <=", value, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayIn(List<Integer> values) {
            addCriterion("putaway in", values, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotIn(List<Integer> values) {
            addCriterion("putaway not in", values, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayBetween(Integer value1, Integer value2) {
            addCriterion("putaway between", value1, value2, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawayNotBetween(Integer value1, Integer value2) {
            addCriterion("putaway not between", value1, value2, "putaway");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeIsNull() {
            addCriterion("putawayTime is null");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeIsNotNull() {
            addCriterion("putawayTime is not null");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeEqualTo(Date value) {
            addCriterion("putawayTime =", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeNotEqualTo(Date value) {
            addCriterion("putawayTime <>", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeGreaterThan(Date value) {
            addCriterion("putawayTime >", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("putawayTime >=", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeLessThan(Date value) {
            addCriterion("putawayTime <", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeLessThanOrEqualTo(Date value) {
            addCriterion("putawayTime <=", value, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeIn(List<Date> values) {
            addCriterion("putawayTime in", values, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeNotIn(List<Date> values) {
            addCriterion("putawayTime not in", values, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeBetween(Date value1, Date value2) {
            addCriterion("putawayTime between", value1, value2, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andPutawaytimeNotBetween(Date value1, Date value2) {
            addCriterion("putawayTime not between", value1, value2, "putawaytime");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNull() {
            addCriterion("goodsNumber is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIsNotNull() {
            addCriterion("goodsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberEqualTo(String value) {
            addCriterion("goodsNumber =", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotEqualTo(String value) {
            addCriterion("goodsNumber <>", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThan(String value) {
            addCriterion("goodsNumber >", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("goodsNumber >=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThan(String value) {
            addCriterion("goodsNumber <", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLessThanOrEqualTo(String value) {
            addCriterion("goodsNumber <=", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberLike(String value) {
            addCriterion("goodsNumber like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotLike(String value) {
            addCriterion("goodsNumber not like", value, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberIn(List<String> values) {
            addCriterion("goodsNumber in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotIn(List<String> values) {
            addCriterion("goodsNumber not in", values, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberBetween(String value1, String value2) {
            addCriterion("goodsNumber between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andGoodsnumberNotBetween(String value1, String value2) {
            addCriterion("goodsNumber not between", value1, value2, "goodsnumber");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNull() {
            addCriterion("mch_id is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(Integer value) {
            addCriterion("mch_id =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(Integer value) {
            addCriterion("mch_id <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(Integer value) {
            addCriterion("mch_id >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mch_id >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(Integer value) {
            addCriterion("mch_id <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(Integer value) {
            addCriterion("mch_id <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<Integer> values) {
            addCriterion("mch_id in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<Integer> values) {
            addCriterion("mch_id not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(Integer value1, Integer value2) {
            addCriterion("mch_id between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mch_id not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andSalesnumIsNull() {
            addCriterion("salesNum is null");
            return (Criteria) this;
        }

        public Criteria andSalesnumIsNotNull() {
            addCriterion("salesNum is not null");
            return (Criteria) this;
        }

        public Criteria andSalesnumEqualTo(Integer value) {
            addCriterion("salesNum =", value, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumNotEqualTo(Integer value) {
            addCriterion("salesNum <>", value, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumGreaterThan(Integer value) {
            addCriterion("salesNum >", value, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesNum >=", value, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumLessThan(Integer value) {
            addCriterion("salesNum <", value, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumLessThanOrEqualTo(Integer value) {
            addCriterion("salesNum <=", value, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumIn(List<Integer> values) {
            addCriterion("salesNum in", values, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumNotIn(List<Integer> values) {
            addCriterion("salesNum not in", values, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumBetween(Integer value1, Integer value2) {
            addCriterion("salesNum between", value1, value2, "salesnum");
            return (Criteria) this;
        }

        public Criteria andSalesnumNotBetween(Integer value1, Integer value2) {
            addCriterion("salesNum not between", value1, value2, "salesnum");
            return (Criteria) this;
        }

        public Criteria andShowIdIsNull() {
            addCriterion("show_id is null");
            return (Criteria) this;
        }

        public Criteria andShowIdIsNotNull() {
            addCriterion("show_id is not null");
            return (Criteria) this;
        }

        public Criteria andShowIdEqualTo(Integer value) {
            addCriterion("show_id =", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotEqualTo(Integer value) {
            addCriterion("show_id <>", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdGreaterThan(Integer value) {
            addCriterion("show_id >", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_id >=", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdLessThan(Integer value) {
            addCriterion("show_id <", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdLessThanOrEqualTo(Integer value) {
            addCriterion("show_id <=", value, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdIn(List<Integer> values) {
            addCriterion("show_id in", values, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotIn(List<Integer> values) {
            addCriterion("show_id not in", values, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdBetween(Integer value1, Integer value2) {
            addCriterion("show_id between", value1, value2, "showId");
            return (Criteria) this;
        }

        public Criteria andShowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("show_id not between", value1, value2, "showId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}