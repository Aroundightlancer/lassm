package com.te.model;

import java.util.Date;

public class Medicine extends Entity {
    private Integer oldId;

    private String oldname;

    private String medicinename;

    private Integer num;

    private Integer result;

    private String is;

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname == null ? null : oldname.trim();
    }

    public String getMedicinename() {
        return medicinename;
    }

    public void setMedicinename(String medicinename) {
        this.medicinename = medicinename == null ? null : medicinename.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
    
    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is == null ? null : is.trim();
    }
}