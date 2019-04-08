package com.te.model;

import java.util.Date;

public class FriendCycle extends Entity {

    private Integer parentId;
    private Integer oldId;
    private String content;
    private Integer friendCycleArticleId;
    private String imgUrl;
    private String name;
    private String pname;

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

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
}