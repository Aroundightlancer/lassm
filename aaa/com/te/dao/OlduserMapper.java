package com.te.dao;

import com.te.model.Olduser;
import com.te.model.OlduserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OlduserMapper {
    int countByExample(OlduserExample example);

    int deleteByExample(OlduserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Olduser record);

    int insertSelective(Olduser record);

    List<Olduser> selectByExample(OlduserExample example);

    Olduser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Olduser record, @Param("example") OlduserExample example);

    int updateByExample(@Param("record") Olduser record, @Param("example") OlduserExample example);

    int updateByPrimaryKeySelective(Olduser record);

    int updateByPrimaryKey(Olduser record);
}