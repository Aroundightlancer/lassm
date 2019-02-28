package com.te.dao;

import com.te.model.Menu;
import com.te.model.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuDao extends CrudDao<Menu> {

    List<Menu> getChild(Integer parentId,Integer userType);

}