package com.te.model.result;

public class ApiResult {

    private Integer resultCode;
    private Object data;
    private String message;
    private Integer draw;
    private Integer recordsTotal;
    private Integer recordsFiltered;

    public ApiResult() {

    }

    public void fail(Integer resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public void fail(Integer resultCode) {
        fail(resultCode, "error operation");
    }

    public void fail(String message) {
        fail(404, message);
    }

    public void fail() {
        fail(404);
    }

    public void success(Integer resultCode) {
        this.resultCode = resultCode;
        this.message = "操作成功";
    }

    public void success(Object data) {
        success(200);
        this.data = data;
    }

    public void success() {
        success(200);
    }

    public void success(Object data,Integer draw,Integer recordsTotal,Integer recordsFiltered) {
        success(200);
        this.data = data;
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public void noData(){
        noData("未查询到相关数据");
    }

    public void noData(String msg){
        setRecordsFiltered(0);
        setRecordsTotal(0);
        fail(404, msg);
    }

}
