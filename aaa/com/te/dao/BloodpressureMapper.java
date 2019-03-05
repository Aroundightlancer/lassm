package com.te.dao;

import com.te.model.Bloodpressure;
import com.te.model.BloodpressureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BloodpressureMapper {
    int countByExample(BloodpressureExample example);

    int deleteByExample(BloodpressureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bloodpressure record);

    int insertSelective(Bloodpressure record);

    List<Bloodpressure> selectByExample(BloodpressureExample example);

    Bloodpressure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bloodpressure record, @Param("example") BloodpressureExample example);

    int updateByExample(@Param("record") Bloodpressure record, @Param("example") BloodpressureExample example);

    int updateByPrimaryKeySelective(Bloodpressure record);

    int updateByPrimaryKey(Bloodpressure record);
}