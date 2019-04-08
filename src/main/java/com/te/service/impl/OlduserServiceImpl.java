package com.te.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.OlduserDao;
import com.te.model.OldUser;
import com.te.model.result.ApiResult;
import com.te.service.OlduserService;

@Service
public class OlduserServiceImpl implements OlduserService{
	@Autowired
	private OlduserDao olduserDao;
	public ApiResult getall(Integer id) {
		ApiResult apiResult = new ApiResult();

		List<OldUser> list = olduserDao.getall(id);
		System.out.println(list);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}

}
