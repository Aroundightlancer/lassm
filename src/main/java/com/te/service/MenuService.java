package com.te.service;

import org.apache.ibatis.annotations.Param;

import com.te.model.result.ApiResult;

public interface MenuService {
	 
    ApiResult getChild(@Param("parentId") Integer parentId,@Param("userType") Integer userType, @Param("menuId") Integer menuId);

}
