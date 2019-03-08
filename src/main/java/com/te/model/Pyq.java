package com.te.model;

import java.util.Date;

public class Pyq extends Entity {
    private Integer userId;

    private Integer oldId;

    private String main;

    private Integer fid;

    private String img;

 
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOldId() {
        return oldId;
    }

    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main == null ? null : main.trim();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

}