package com.te.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.OldDao;
import com.te.model.Old;
import com.te.service.OldService;

@Service
public class OldServiceImpl implements OldService{
	@Autowired
	private OldDao oldDao;

	private static final Logger logger = Logger.getLogger(OldServiceImpl.class);

	public Old get(Integer id) {
		// TODO Auto-generated method stub
		return oldDao.get(id);
	}

	public int update(Old old) {
		// TODO Auto-generated method stub
		Integer flag=0;
		
		try {
			flag=oldDao.update(old);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}
}
	
