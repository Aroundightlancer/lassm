package com.te.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.FriendcycleDao;
import com.te.dao.MenuDao;
import com.te.model.FriendCycle;
import com.te.model.Menu;
import com.te.model.result.ApiResult;
import com.te.service.FriendcycleService;

@Service
public class FriendcycleServiceImpl implements FriendcycleService{
	@Autowired
	private FriendcycleDao friendcycleDao;

	private static final Logger logger = Logger.getLogger(FriendcycleServiceImpl.class);

	public ApiResult getall(Integer oldId) {
		ApiResult apiResult = new ApiResult();
		List<FriendCycle> list = friendcycleDao.getAll(oldId);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}

	public ApiResult getpl(Integer friendCycleId) {
		ApiResult apiResult = new ApiResult();
		List<FriendCycle> list = friendcycleDao.getpl(friendCycleId);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}

	public int insert(FriendCycle friendCycle) {
		int flag=0;
		try {
			flag=friendcycleDao.insert(friendCycle);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}

}
