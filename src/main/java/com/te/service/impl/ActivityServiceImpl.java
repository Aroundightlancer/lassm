package com.te.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.ActivityDao;
import com.te.dao.FriendcycleDao;
import com.te.model.Activity;
import com.te.model.FriendCycle;
import com.te.model.result.ApiResult;
import com.te.service.ActivityService;
import com.te.service.FriendcycleService;

@Service
public class ActivityServiceImpl implements ActivityService{
	@Autowired
	private ActivityDao activityDao;

	private static final Logger logger = Logger.getLogger(FriendcycleServiceImpl.class);

	public ApiResult getall(Integer oldId) {
		ApiResult apiResult = new ApiResult();
		List<Activity> list = activityDao.getAll(oldId);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}

}
