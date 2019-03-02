package com.te.service.impl;

import com.te.dao.RiZhiDao;
import com.te.model.RiZhi;
import com.te.util.JsonProcessUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class RiZhiService {

    @Autowired
    RiZhiDao riZhiDao;

    @Async
    public void insert(Integer lx, Integer fujilx, Object oldItems, Object newItems, String username){
        String content = "修改前:" + JsonProcessUtil.beanToJson(oldItems) + "," + "修改后:" + JsonProcessUtil.beanToJson(newItems);
        insertTask( lx, fujilx, content, username);
    }

    @Async
    public void insert(Integer lx, Integer fujilx, String content, String username) {
        insertTask(lx, fujilx, content, username);
    }

    private void insertTask(Integer lx, Integer fujilx, String content, String username) {
        RiZhi riZhi = new RiZhi();
        riZhi.setType(lx);
        riZhi.setParentType(fujilx);
        riZhi.setContent(content);
        riZhi.setUsername(username);
        riZhiDao.insert(riZhi);
    }

}
