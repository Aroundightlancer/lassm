package com.te.model;

import java.util.Date;

public class Illness  extends Entity{
    private Integer oldid;

    private String oldname;

    private String illnessname;

    private Date date;

    private String medi;

    private String isok;

    private String method;

  
    public Integer getOldid() {
        return oldid;
    }

    public void setOldid(Integer oldid) {
        this.oldid = oldid;
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname == null ? null : oldname.trim();
    }

    public String getIllnessname() {
        return illnessname;
    }

    public void setIllnessname(String illnessname) {
        this.illnessname = illnessname == null ? null : illnessname.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMedi() {
        return medi;
    }

    public void setMedi(String medi) {
        this.medi = medi == null ? null : medi.trim();
    }

    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}