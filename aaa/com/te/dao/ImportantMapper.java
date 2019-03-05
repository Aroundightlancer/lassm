package com.te.dao;

import com.te.model.Important;
import com.te.model.ImportantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportantMapper {
    int countByExample(ImportantExample example);

    int deleteByExample(ImportantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Important record);

    int insertSelective(Important record);

    List<Important> selectByExample(ImportantExample example);

    Important selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Important record, @Param("example") ImportantExample example);

    int updateByExample(@Param("record") Important record, @Param("example") ImportantExample example);

    int updateByPrimaryKeySelective(Important record);

    int updateByPrimaryKey(Important record);
}