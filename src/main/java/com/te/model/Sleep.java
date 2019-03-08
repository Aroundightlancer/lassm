package com.te.model;

import java.util.Date;

public class Sleep extends Entity {
    private Integer oldId;

    private String shutime;

    private String ise;

    private String fen;

    private String isok;

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public String getShutime() {
        return shutime;
    }

    public void setShutime(String shutime) {
        this.shutime = shutime == null ? null : shutime.trim();
    }

    public String getIse() {
        return ise;
    }

    public void setIse(String ise) {
        this.ise = ise == null ? null : ise.trim();
    }

    public String getFen() {
        return fen;
    }

    public void setFen(String fen) {
        this.fen = fen == null ? null : fen.trim();
    }

    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }
}