package com.te.dao;

import com.te.model.Menu;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MenuDao extends CrudDao<Menu> {

    List<Menu> getChild(@Param("parentId") Integer parentId,@Param("userType") Integer userType,@Param("menuId") Integer menuId);

}