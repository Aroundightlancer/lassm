package com.te.model;

import java.util.Date;

public class HeartRate extends Entity{
   
    private Integer oldId;
    private Integer heartRate;
    private Integer normalflag;

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getNormalflag() {
        return normalflag;
    }

    public void setNormalflag(Integer normalflag) {
        this.normalflag = normalflag;
    }
}