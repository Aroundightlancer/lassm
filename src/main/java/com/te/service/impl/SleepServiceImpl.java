package com.te.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.FriendcycleDao;
import com.te.dao.SleepDao;
import com.te.model.FriendCycle;
import com.te.model.Sleep;
import com.te.model.result.ApiResult;
import com.te.service.SleepService;;
@Service
public class SleepServiceImpl implements SleepService{
	@Autowired
	private SleepDao sleepDao;

	private static final Logger logger = Logger.getLogger(SleepServiceImpl.class);

	public ApiResult getall(Integer oldId) {
		ApiResult apiResult = new ApiResult();
		List<Sleep> list = sleepDao.getAll(oldId);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}

}
