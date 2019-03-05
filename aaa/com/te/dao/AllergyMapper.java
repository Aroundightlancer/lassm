package com.te.dao;

import com.te.model.Allergy;
import com.te.model.AllergyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllergyMapper {
    int countByExample(AllergyExample example);

    int deleteByExample(AllergyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Allergy record);

    int insertSelective(Allergy record);

    List<Allergy> selectByExample(AllergyExample example);

    Allergy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Allergy record, @Param("example") AllergyExample example);

    int updateByExample(@Param("record") Allergy record, @Param("example") AllergyExample example);

    int updateByPrimaryKeySelective(Allergy record);

    int updateByPrimaryKey(Allergy record);
}