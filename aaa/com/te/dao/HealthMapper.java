package com.te.dao;

import com.te.model.Health;
import com.te.model.HealthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthMapper {
    int countByExample(HealthExample example);

    int deleteByExample(HealthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Health record);

    int insertSelective(Health record);

    List<Health> selectByExample(HealthExample example);

    Health selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Health record, @Param("example") HealthExample example);

    int updateByExample(@Param("record") Health record, @Param("example") HealthExample example);

    int updateByPrimaryKeySelective(Health record);

    int updateByPrimaryKey(Health record);
}