package com.te.model;

import java.util.Date;

public class PersonalChronicle extends Entity{
 
    private Integer oldId;
    private String oldName;
    private String importantName;
    private String degree;
    private String treatment;
    private Integer normalflag;

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getImportantName() {
        return importantName;
    }

    public void setImportantName(String importantName) {
        this.importantName = importantName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Integer getNormalflag() {
        return normalflag;
    }

    public void setNormalflag(Integer normalflag) {
        this.normalflag = normalflag;
    }
}