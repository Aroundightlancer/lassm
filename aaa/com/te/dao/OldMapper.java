package com.te.dao;

import com.te.model.Old;
import com.te.model.OldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OldMapper {
    int countByExample(OldExample example);

    int deleteByExample(OldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Old record);

    int insertSelective(Old record);

    List<Old> selectByExample(OldExample example);

    Old selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Old record, @Param("example") OldExample example);

    int updateByExample(@Param("record") Old record, @Param("example") OldExample example);

    int updateByPrimaryKeySelective(Old record);

    int updateByPrimaryKey(Old record);
}