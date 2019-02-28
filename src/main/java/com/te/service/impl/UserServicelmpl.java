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
		
		public List<User> getAllUser(){
			return userDao.getAllUser();
		}

		 public User checkLogin(@Param("name") String name, @Param("pwd") String pwd){
			User user = new User();
			try {
				if (name != null) {
					if (pwd != null) {
						user = userDao.checkLogin(name, pwd);
					} else {
						logger.info("鐎靛棛鐖滄稉铏光敄!");
					}
				} else {
					logger.info("閻€劍鍩涢崥宥勮礋缁岋拷!");
				}
			}catch (Exception e) {
				logger.error("閻ц缍嶉崙铏瑰箛瀵倸鐖�!" + e.toString());
			}
			return user;
		}
		 public Integer insertUser(@Param("name") String name, @Param("pwd") String pwd){
			 Integer flag=0;
			 try {
				 flag=userDao.insertUser(name,pwd);
				 
			 }
			 catch (Exception e) {
				logger.error("鐢ㄦ埛鏇存柊澶辫触" + e.toString());
			}
			 return flag;
		 }
		public User getUser(@Param("id") Integer id)
		{
			User user=new User();
			if(id!=null)
			{
				try {
					user=userDao.getUser(id);
				} catch (Exception e) {
					logger.error("閻ц缍嶉崙铏瑰箛瀵倸鐖�!" + e.toString());
				}
			}
			return user;
		}
		public Integer upUser(User user)
		{
			Integer flag=0;
			
			try {
				flag=userDao.upUser(user);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return flag;
			
		}
		public User selectByname(String username) {
			return userDao.selectByname(username);
		}
}