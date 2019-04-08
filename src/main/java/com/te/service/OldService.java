package com.te.service;

import org.apache.ibatis.annotations.Param;

import com.te.model.Old;

public interface OldService {
	Old get(@Param("id") Integer id);
	 public int update(Old old);
}
