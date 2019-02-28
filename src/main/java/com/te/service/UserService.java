package com.te.service;
import com.te.model.User;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
public interface UserService {
	List<User> getAllUser();
	User checkLogin(@Param("name") String name, @Param("pwd") String pwd);
	Integer insertUser(@Param("name") String name, @Param("pwd") String pwd);
	User getUser(@Param("id") Integer id);
	Integer upUser(User user);
	 User selectByname(String username);
}
