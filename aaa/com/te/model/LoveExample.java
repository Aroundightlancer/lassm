package com.te.model;

import java.util.ArrayList;
import java.util.List;

public class LoveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoveExample() {
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

        public Criteria andOldIdIsNull() {
            addCriterion("old_id is null");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNotNull() {
            addCriterion("old_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldIdEqualTo(String value) {
            addCriterion("old_id =", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotEqualTo(String value) {
            addCriterion("old_id <>", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThan(String value) {
            addCriterion("old_id >", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThanOrEqualTo(String value) {
            addCriterion("old_id >=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThan(String value) {
            addCriterion("old_id <", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThanOrEqualTo(String value) {
            addCriterion("old_id <=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLike(String value) {
            addCriterion("old_id like", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotLike(String value) {
            addCriterion("old_id not like", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdIn(List<String> values) {
            addCriterion("old_id in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotIn(List<String> values) {
            addCriterion("old_id not in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdBetween(String value1, String value2) {
            addCriterion("old_id between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotBetween(String value1, String value2) {
            addCriterion("old_id not between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andLoveIsNull() {
            addCriterion("love is null");
            return (Criteria) this;
        }

        public Criteria andLoveIsNotNull() {
            addCriterion("love is not null");
            return (Criteria) this;
        }

        public Criteria andLoveEqualTo(String value) {
            addCriterion("love =", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotEqualTo(String value) {
            addCriterion("love <>", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveGreaterThan(String value) {
            addCriterion("love >", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveGreaterThanOrEqualTo(String value) {
            addCriterion("love >=", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveLessThan(String value) {
            addCriterion("love <", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveLessThanOrEqualTo(String value) {
            addCriterion("love <=", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveLike(String value) {
            addCriterion("love like", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotLike(String value) {
            addCriterion("love not like", value, "love");
            return (Criteria) this;
        }

        public Criteria andLoveIn(List<String> values) {
            addCriterion("love in", values, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotIn(List<String> values) {
            addCriterion("love not in", values, "love");
            return (Criteria) this;
        }

        public Criteria andLoveBetween(String value1, String value2) {
            addCriterion("love between", value1, value2, "love");
            return (Criteria) this;
        }

        public Criteria andLoveNotBetween(String value1, String value2) {
            addCriterion("love not between", value1, value2, "love");
            return (Criteria) this;
        }

        public Criteria andFenIsNull() {
            addCriterion("fen is null");
            return (Criteria) this;
        }

        public Criteria andFenIsNotNull() {
            addCriterion("fen is not null");
            return (Criteria) this;
        }

        public Criteria andFenEqualTo(String value) {
            addCriterion("fen =", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotEqualTo(String value) {
            addCriterion("fen <>", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenGreaterThan(String value) {
            addCriterion("fen >", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenGreaterThanOrEqualTo(String value) {
            addCriterion("fen >=", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLessThan(String value) {
            addCriterion("fen <", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLessThanOrEqualTo(String value) {
            addCriterion("fen <=", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenLike(String value) {
            addCriterion("fen like", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotLike(String value) {
            addCriterion("fen not like", value, "fen");
            return (Criteria) this;
        }

        public Criteria andFenIn(List<String> values) {
            addCriterion("fen in", values, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotIn(List<String> values) {
            addCriterion("fen not in", values, "fen");
            return (Criteria) this;
        }

        public Criteria andFenBetween(String value1, String value2) {
            addCriterion("fen between", value1, value2, "fen");
            return (Criteria) this;
        }

        public Criteria andFenNotBetween(String value1, String value2) {
            addCriterion("fen not between", value1, value2, "fen");
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

        public Criteria andProposalIsNull() {
            addCriterion("proposal is null");
            return (Criteria) this;
        }

        public Criteria andProposalIsNotNull() {
            addCriterion("proposal is not null");
            return (Criteria) this;
        }

        public Criteria andProposalEqualTo(Integer value) {
            addCriterion("proposal =", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotEqualTo(Integer value) {
            addCriterion("proposal <>", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalGreaterThan(Integer value) {
            addCriterion("proposal >", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalGreaterThanOrEqualTo(Integer value) {
            addCriterion("proposal >=", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLessThan(Integer value) {
            addCriterion("proposal <", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLessThanOrEqualTo(Integer value) {
            addCriterion("proposal <=", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalIn(List<Integer> values) {
            addCriterion("proposal in", values, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotIn(List<Integer> values) {
            addCriterion("proposal not in", values, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalBetween(Integer value1, Integer value2) {
            addCriterion("proposal between", value1, value2, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotBetween(Integer value1, Integer value2) {
            addCriterion("proposal not between", value1, value2, "proposal");
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