package com.te.service;

import org.apache.ibatis.annotations.Param;

import com.te.model.FriendCycle;
import com.te.model.result.ApiResult;

public interface FriendcycleService {
    ApiResult getall(@Param("oldId") Integer oldId);
    ApiResult getpl(@Param("friendCycleId") Integer friendCycleId);
    public int insert(FriendCycle friendCycle);

    
}
