package com.te.service;
import com.te.model.User;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
public interface UserService {
	User checkLogin(@Param("name") String name, @Param("pwd") String pwd);

}
