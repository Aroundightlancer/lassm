package com.te.dao;

import com.te.model.Sleep;
import com.te.model.SleepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SleepMapper {
    int countByExample(SleepExample example);

    int deleteByExample(SleepExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sleep record);

    int insertSelective(Sleep record);

    List<Sleep> selectByExample(SleepExample example);

    Sleep selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sleep record, @Param("example") SleepExample example);

    int updateByExample(@Param("record") Sleep record, @Param("example") SleepExample example);

    int updateByPrimaryKeySelective(Sleep record);

    int updateByPrimaryKey(Sleep record);
}