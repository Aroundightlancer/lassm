package com.te.service;
import com.te.model.User;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
public interface UserService {
<<<<<<< HEAD
=======

>>>>>>> 225579e3a40b596d9cc683dfb8c7800a6f55491c
	User checkLogin(@Param("name") String name, @Param("pwd") String pwd);

}
