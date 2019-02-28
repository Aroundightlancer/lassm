package com.te.service.impl;

import java.util.List;

import com.te.model.result.ApiResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.MenuDao;
import com.te.model.Menu;
import com.te.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	private MenuDao menuDao;

	private static final Logger logger = Logger.getLogger(MenuServiceImpl.class);

	public ApiResult getChild(Integer parentId, Integer userType) {
		ApiResult apiResult = new ApiResult();

		List<Menu> list = menuDao.getChild(parentId, userType);
		if(list == null || list.size() <= 0) {
			apiResult.noData();
			return apiResult;
		}
		apiResult.success(list);

		return apiResult;
	}
	
	
}
