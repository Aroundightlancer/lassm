package com.te.dao;

import com.te.model.Illness;
import com.te.model.IllnessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IllnessMapper {
    int countByExample(IllnessExample example);

    int deleteByExample(IllnessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Illness record);

    int insertSelective(Illness record);

    List<Illness> selectByExample(IllnessExample example);

    Illness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Illness record, @Param("example") IllnessExample example);

    int updateByExample(@Param("record") Illness record, @Param("example") IllnessExample example);

    int updateByPrimaryKeySelective(Illness record);

    int updateByPrimaryKey(Illness record);
}