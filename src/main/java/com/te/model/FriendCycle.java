package com.te.model;

import java.util.Date;

public class FriendCycle extends Entity {

    private Integer userId;
    private Integer oldId;
    private String content;
    private Integer friendCycleArticleId;
    private String imgUrl;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFriendCycleArticleId() {
        return friendCycleArticleId;
    }

    public void setFriendCycleArticleId(Integer friendCycleArticleId) {
        this.friendCycleArticleId = friendCycleArticleId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}