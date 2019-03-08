package com.te.model;

import java.util.Date;

public class Important  extends Entity{
 
    private Integer oldid;

    private String oldname;

    private String importantname;

    private String degree;

    private String method;

    private String isok;


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

    public String getImportantname() {
        return importantname;
    }

    public void setImportantname(String importantname) {
        this.importantname = importantname == null ? null : importantname.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

  
}