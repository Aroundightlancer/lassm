package com.te.dao;

import com.te.model.Heartrate;
import com.te.model.HeartrateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeartrateMapper {
    int countByExample(HeartrateExample example);

    int deleteByExample(HeartrateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Heartrate record);

    int insertSelective(Heartrate record);

    List<Heartrate> selectByExample(HeartrateExample example);

    Heartrate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Heartrate record, @Param("example") HeartrateExample example);

    int updateByExample(@Param("record") Heartrate record, @Param("example") HeartrateExample example);

    int updateByPrimaryKeySelective(Heartrate record);

    int updateByPrimaryKey(Heartrate record);
}