package com.te.dao;

import com.te.model.Pyq;
import com.te.model.PyqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PyqMapper {
    int countByExample(PyqExample example);

    int deleteByExample(PyqExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pyq record);

    int insertSelective(Pyq record);

    List<Pyq> selectByExample(PyqExample example);

    Pyq selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pyq record, @Param("example") PyqExample example);

    int updateByExample(@Param("record") Pyq record, @Param("example") PyqExample example);

    int updateByPrimaryKeySelective(Pyq record);

    int updateByPrimaryKey(Pyq record);
}