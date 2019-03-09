package com.te.dao;

import com.te.model.Menu;

import java.util.List;

public interface MenuDao extends CrudDao<Menu> {

    List<Menu> getChild(Integer parentId,Integer userType);

}