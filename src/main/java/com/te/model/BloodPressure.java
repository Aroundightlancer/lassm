package com.te.model;

import java.util.Date;

public class BloodPressure extends Entity {

    private String oldId;
    private Integer systolic;
    private Integer diastolic;
    private Integer normalflag;

    public String getOldId() {
        return oldId;
    }

    public void setOldId(String oldId) {
        this.oldId = oldId;
    }

    public Integer getSystolic() {
        return systolic;
    }

    public void setSystolic(Integer systolic) {
        this.systolic = systolic;
    }

    public Integer getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(Integer diastolic) {
        this.diastolic = diastolic;
    }

    public Integer getNormalflag() {
        return normalflag;
    }

    public void setNormalflag(Integer normalflag) {
        this.normalflag = normalflag;
    }
}