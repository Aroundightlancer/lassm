package com.te.service;

import org.apache.ibatis.annotations.Param;

import com.te.model.result.ApiResult;

public interface OlduserService {
	ApiResult getall(@Param("id") Integer id);

}
