package com.te.service;

import org.apache.ibatis.annotations.Param;

import com.te.model.result.ApiResult;

public interface FoodService {
	 ApiResult getall(@Param("oldId") Integer oldId);

}
