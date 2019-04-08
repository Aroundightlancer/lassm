package com.te.dao;

import com.te.model.FriendCycle;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendcycleDao extends CrudDao<FriendCycle>{
   List<FriendCycle> getpl(@Param("friendCycleId") int friendCycleId);
}