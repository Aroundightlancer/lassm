package com.te.service;

import com.te.model.result.ApiResult;

public interface MenuService {
	 
    ApiResult getChild(Integer parentId, Integer userType);

}
