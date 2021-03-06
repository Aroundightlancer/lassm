package com.te.service.impl;
import com.te.dao.UserDao;
import com.te.model.User;
import com.te.service.UserService;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public  class UserServicelmpl implements UserService{
		@Autowired
		private UserDao userDao;
		private static final Logger logger = Logger.getLogger(UserServicelmpl.class);
		 public User checkLogin(@Param("name") String name, @Param("pwd") String pwd){
			return userDao.checkLogin(name, pwd);
		 }
}
