package com.te.model;

import java.util.Date;

public class Bloodpressure extends Entity {
    private String oldId;

    private String high;

    private String low;

    private String isok;

    public String getOldId() {
        return oldId;
    }

    public void setOldId(String oldId) {
        this.oldId = oldId == null ? null : oldId.trim();
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high == null ? null : high.trim();
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low == null ? null : low.trim();
    }
    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }
}