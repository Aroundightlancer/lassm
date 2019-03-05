package com.te.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImportantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportantExample() {
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

        public Criteria andOldidIsNull() {
            addCriterion("oldid is null");
            return (Criteria) this;
        }

        public Criteria andOldidIsNotNull() {
            addCriterion("oldid is not null");
            return (Criteria) this;
        }

        public Criteria andOldidEqualTo(Integer value) {
            addCriterion("oldid =", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotEqualTo(Integer value) {
            addCriterion("oldid <>", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidGreaterThan(Integer value) {
            addCriterion("oldid >", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oldid >=", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLessThan(Integer value) {
            addCriterion("oldid <", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidLessThanOrEqualTo(Integer value) {
            addCriterion("oldid <=", value, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidIn(List<Integer> values) {
            addCriterion("oldid in", values, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotIn(List<Integer> values) {
            addCriterion("oldid not in", values, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidBetween(Integer value1, Integer value2) {
            addCriterion("oldid between", value1, value2, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldidNotBetween(Integer value1, Integer value2) {
            addCriterion("oldid not between", value1, value2, "oldid");
            return (Criteria) this;
        }

        public Criteria andOldnameIsNull() {
            addCriterion("oldname is null");
            return (Criteria) this;
        }

        public Criteria andOldnameIsNotNull() {
            addCriterion("oldname is not null");
            return (Criteria) this;
        }

        public Criteria andOldnameEqualTo(String value) {
            addCriterion("oldname =", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotEqualTo(String value) {
            addCriterion("oldname <>", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameGreaterThan(String value) {
            addCriterion("oldname >", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameGreaterThanOrEqualTo(String value) {
            addCriterion("oldname >=", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLessThan(String value) {
            addCriterion("oldname <", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLessThanOrEqualTo(String value) {
            addCriterion("oldname <=", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLike(String value) {
            addCriterion("oldname like", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotLike(String value) {
            addCriterion("oldname not like", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameIn(List<String> values) {
            addCriterion("oldname in", values, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotIn(List<String> values) {
            addCriterion("oldname not in", values, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameBetween(String value1, String value2) {
            addCriterion("oldname between", value1, value2, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotBetween(String value1, String value2) {
            addCriterion("oldname not between", value1, value2, "oldname");
            return (Criteria) this;
        }

        public Criteria andImportantnameIsNull() {
            addCriterion("importantname is null");
            return (Criteria) this;
        }

        public Criteria andImportantnameIsNotNull() {
            addCriterion("importantname is not null");
            return (Criteria) this;
        }

        public Criteria andImportantnameEqualTo(String value) {
            addCriterion("importantname =", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameNotEqualTo(String value) {
            addCriterion("importantname <>", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameGreaterThan(String value) {
            addCriterion("importantname >", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameGreaterThanOrEqualTo(String value) {
            addCriterion("importantname >=", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameLessThan(String value) {
            addCriterion("importantname <", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameLessThanOrEqualTo(String value) {
            addCriterion("importantname <=", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameLike(String value) {
            addCriterion("importantname like", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameNotLike(String value) {
            addCriterion("importantname not like", value, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameIn(List<String> values) {
            addCriterion("importantname in", values, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameNotIn(List<String> values) {
            addCriterion("importantname not in", values, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameBetween(String value1, String value2) {
            addCriterion("importantname between", value1, value2, "importantname");
            return (Criteria) this;
        }

        public Criteria andImportantnameNotBetween(String value1, String value2) {
            addCriterion("importantname not between", value1, value2, "importantname");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andIsokIsNull() {
            addCriterion("isok is null");
            return (Criteria) this;
        }

        public Criteria andIsokIsNotNull() {
            addCriterion("isok is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEqualTo(String value) {
            addCriterion("isok =", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotEqualTo(String value) {
            addCriterion("isok <>", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThan(String value) {
            addCriterion("isok >", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThanOrEqualTo(String value) {
            addCriterion("isok >=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThan(String value) {
            addCriterion("isok <", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThanOrEqualTo(String value) {
            addCriterion("isok <=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLike(String value) {
            addCriterion("isok like", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotLike(String value) {
            addCriterion("isok not like", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokIn(List<String> values) {
            addCriterion("isok in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotIn(List<String> values) {
            addCriterion("isok not in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokBetween(String value1, String value2) {
            addCriterion("isok between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotBetween(String value1, String value2) {
            addCriterion("isok not between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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