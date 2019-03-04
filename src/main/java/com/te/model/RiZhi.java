package com.te.model;

public class RiZhi extends Entity {

    private Integer type;
    private Integer parentType;
    private String content;
    private String username;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentType() {
        return parentType;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
