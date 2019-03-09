package com.te.model;

import java.util.Date;

public class Medicine extends Entity {

    private Integer oldId;
    private String oldName;
    private String medicineName;
    private Integer dosage;
    private Integer useReason;

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

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public Integer getUseReason() {
        return useReason;
    }

    public void setUseReason(Integer useReason) {
        this.useReason = useReason;
    }
}