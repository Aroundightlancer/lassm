package com.te.service;

import java.util.List;

import com.te.model.result.ApiResult;
import org.apache.ibatis.annotations.Param;

import com.te.model.Menu;
import com.te.model.MenuExample;

public interface MenuService {
	 
    ApiResult getChild(Integer parentId, Integer userType);

}
