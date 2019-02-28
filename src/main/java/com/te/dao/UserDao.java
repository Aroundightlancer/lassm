package com.te.dao;
import java.util.List;

import com.te.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
public interface UserDao {
	//User check(@Param("name") String name,@Param("pwd") String pwd);
	 //User getSingleUser(@Param("name") String name);
	 List<User> getAllUser();
	 User checkLogin(@Param("name") String name, @Param("pwd") String pwd);
	 Integer insertUser(@Param("name") String name, @Param("pwd") String pwd);
	 User getUser(@Param("id") Integer id);
	 Integer upUser(User user);
	 User selectByname(String username);
}
