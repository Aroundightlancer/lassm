package com.te.model;

public class Praise extends Entity {

    private String username;

    private Integer pyqid;

    private String msg;

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getPyqid() {
        return pyqid;
    }

    public void setPyqid(Integer pyqid) {
        this.pyqid = pyqid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}