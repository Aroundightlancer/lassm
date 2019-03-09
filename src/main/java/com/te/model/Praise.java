package com.te.model;

public class Praise extends Entity {

    private String userId;
    private String userName;
    private Integer friendCycleArticleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getFriendCycleArticleId() {
        return friendCycleArticleId;
    }

    public void setFriendCycleArticleId(Integer friendCycleArticleId) {
        this.friendCycleArticleId = friendCycleArticleId;
    }
}