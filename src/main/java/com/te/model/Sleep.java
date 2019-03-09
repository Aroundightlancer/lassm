package com.te.model;

import java.util.Date;

public class Sleep extends Entity {

    private Integer oldId;
    private String sleepTime;
    private String nightmaresflag;
    private String grade;
    private String normalflag;

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public String getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(String sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getNightmaresflag() {
        return nightmaresflag;
    }

    public void setNightmaresflag(String nightmaresflag) {
        this.nightmaresflag = nightmaresflag;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNormalflag() {
        return normalflag;
    }

    public void setNormalflag(String normalflag) {
        this.normalflag = normalflag;
    }
}