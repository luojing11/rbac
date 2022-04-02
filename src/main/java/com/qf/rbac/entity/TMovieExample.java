package com.qf.rbac.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMovieExample() {
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

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Long value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Long value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Long value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Long value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Long value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Long value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Long> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Long> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Long value1, Long value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Long value1, Long value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMoviePictureIsNull() {
            addCriterion("movie_picture is null");
            return (Criteria) this;
        }

        public Criteria andMoviePictureIsNotNull() {
            addCriterion("movie_picture is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePictureEqualTo(String value) {
            addCriterion("movie_picture =", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotEqualTo(String value) {
            addCriterion("movie_picture <>", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureGreaterThan(String value) {
            addCriterion("movie_picture >", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureGreaterThanOrEqualTo(String value) {
            addCriterion("movie_picture >=", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureLessThan(String value) {
            addCriterion("movie_picture <", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureLessThanOrEqualTo(String value) {
            addCriterion("movie_picture <=", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureLike(String value) {
            addCriterion("movie_picture like", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotLike(String value) {
            addCriterion("movie_picture not like", value, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureIn(List<String> values) {
            addCriterion("movie_picture in", values, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotIn(List<String> values) {
            addCriterion("movie_picture not in", values, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureBetween(String value1, String value2) {
            addCriterion("movie_picture between", value1, value2, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMoviePictureNotBetween(String value1, String value2) {
            addCriterion("movie_picture not between", value1, value2, "moviePicture");
            return (Criteria) this;
        }

        public Criteria andMovieInfoIsNull() {
            addCriterion("movie_info is null");
            return (Criteria) this;
        }

        public Criteria andMovieInfoIsNotNull() {
            addCriterion("movie_info is not null");
            return (Criteria) this;
        }

        public Criteria andMovieInfoEqualTo(String value) {
            addCriterion("movie_info =", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoNotEqualTo(String value) {
            addCriterion("movie_info <>", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoGreaterThan(String value) {
            addCriterion("movie_info >", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoGreaterThanOrEqualTo(String value) {
            addCriterion("movie_info >=", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoLessThan(String value) {
            addCriterion("movie_info <", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoLessThanOrEqualTo(String value) {
            addCriterion("movie_info <=", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoLike(String value) {
            addCriterion("movie_info like", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoNotLike(String value) {
            addCriterion("movie_info not like", value, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoIn(List<String> values) {
            addCriterion("movie_info in", values, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoNotIn(List<String> values) {
            addCriterion("movie_info not in", values, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoBetween(String value1, String value2) {
            addCriterion("movie_info between", value1, value2, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieInfoNotBetween(String value1, String value2) {
            addCriterion("movie_info not between", value1, value2, "movieInfo");
            return (Criteria) this;
        }

        public Criteria andMovieStartIsNull() {
            addCriterion("movie_start is null");
            return (Criteria) this;
        }

        public Criteria andMovieStartIsNotNull() {
            addCriterion("movie_start is not null");
            return (Criteria) this;
        }

        public Criteria andMovieStartEqualTo(Date value) {
            addCriterion("movie_start =", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartNotEqualTo(Date value) {
            addCriterion("movie_start <>", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartGreaterThan(Date value) {
            addCriterion("movie_start >", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_start >=", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartLessThan(Date value) {
            addCriterion("movie_start <", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartLessThanOrEqualTo(Date value) {
            addCriterion("movie_start <=", value, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartIn(List<Date> values) {
            addCriterion("movie_start in", values, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartNotIn(List<Date> values) {
            addCriterion("movie_start not in", values, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartBetween(Date value1, Date value2) {
            addCriterion("movie_start between", value1, value2, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStartNotBetween(Date value1, Date value2) {
            addCriterion("movie_start not between", value1, value2, "movieStart");
            return (Criteria) this;
        }

        public Criteria andMovieStopIsNull() {
            addCriterion("movie_stop is null");
            return (Criteria) this;
        }

        public Criteria andMovieStopIsNotNull() {
            addCriterion("movie_stop is not null");
            return (Criteria) this;
        }

        public Criteria andMovieStopEqualTo(Date value) {
            addCriterion("movie_stop =", value, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopNotEqualTo(Date value) {
            addCriterion("movie_stop <>", value, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopGreaterThan(Date value) {
            addCriterion("movie_stop >", value, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopGreaterThanOrEqualTo(Date value) {
            addCriterion("movie_stop >=", value, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopLessThan(Date value) {
            addCriterion("movie_stop <", value, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopLessThanOrEqualTo(Date value) {
            addCriterion("movie_stop <=", value, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopIn(List<Date> values) {
            addCriterion("movie_stop in", values, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopNotIn(List<Date> values) {
            addCriterion("movie_stop not in", values, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopBetween(Date value1, Date value2) {
            addCriterion("movie_stop between", value1, value2, "movieStop");
            return (Criteria) this;
        }

        public Criteria andMovieStopNotBetween(Date value1, Date value2) {
            addCriterion("movie_stop not between", value1, value2, "movieStop");
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