package com.te.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.FriendcycleDao;
import com.te.dao.MedicineDao;
import com.te.model.FriendCycle;
import com.te.model.Medicine;
import com.te.model.result.ApiResult;
import com.te.service.ActivityService;
import com.te.service.MedicineService;
@Service
public class MedicineServiceImpl implements MedicineService{
	@Autowired
	private MedicineDao medicineDao;

	private static final Logger logger = Logger.getLogger(MedicineServiceImpl.class);

	public ApiResult getall(Integer oldId) {
		ApiResult apiResult = new ApiResult();
		List<Medicine> list = medicineDao.getAll(oldId);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}

}
