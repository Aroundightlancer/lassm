package com.te.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.FriendcycleDao;
import com.te.dao.HobbyDao;
import com.te.model.FriendCycle;
import com.te.model.Hobby;
import com.te.model.result.ApiResult;
import com.te.service.ActivityService;
import com.te.service.HobbyService;
@Service
public class HobbyServiceImpl implements HobbyService{
	@Autowired
	private HobbyDao hobbyDao;

	private static final Logger logger = Logger.getLogger(HobbyServiceImpl.class);

	public ApiResult getall(Integer oldId) {
		ApiResult apiResult = new ApiResult();
		List<Hobby> list = hobbyDao.getAll(oldId);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}


}
