package com.te.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.te.model.User;
import com.te.service.UserService;
import com.te.util.ProcessResultEnum;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
@Controller
@RequestMapping(value = "/User")
public class UserController {
	@Autowired
    private UserService userService;
    private static final Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping(value = "/CheckLogin")
    private String checkLogin(String username, String password, RedirectAttributesModelMap modelMap, HttpServletRequest request) {
        logger.info("--" + username);
        logger.info("00" + password);
        User user = userService.checkLogin(username,password);
        if (user != null) {
            request.getSession().setAttribute("user", user);
            return "index";
        }
        else {
            modelMap.addFlashAttribute("flag", ProcessResultEnum.RETURN_RESULT_FAILED);
            return "../index";
        }
        
    }
    @RequestMapping(value = "/getall")

    private String getAllUserInfo(Model model){
    	//List<User> userList=new ArrayList<User>();
//    	try {
//			userList=userService.getAllUser();
//			for(User user : userList){
//				
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			logger.error("获取用户失败" + e.toString());
//		}
        List<User> user =userService.getAllUser();

    	model.addAttribute("User", user);
    	return "userList";
    }
    @RequestMapping(value="/insert")
    private String insertuser(String name, String pwd, RedirectAttributesModelMap model)
    {
    	 logger.info("--" + name);
         logger.info("00" + pwd);
        
    	Integer flag=0;
    	try {
    	flag=userService.insertUser(name, pwd);
    	if(flag == 1) {
			model.addFlashAttribute("flag",ProcessResultEnum.RETURN_RESULT_SUCCESS);
			
        }
        else {
        	model.addFlashAttribute("flag",ProcessResultEnum.RETURN_RESULT_FAILED);
        }
    	} catch (Exception e) {
		// TODO: handle exception
		logger.error("更新用户失败" + e.toString());
		model.addFlashAttribute("flag",ProcessResultEnum.RETURN_RESULT_ERROR);
    	}
		return "redirect:/User/getall";
    	
    }
    @RequestMapping(value="/getuser/{id}")
    private @ResponseBody User getSingleUserInfo(@PathVariable("id") Integer id)
    {
    	User user=new User();
    	try {
			user=userService.getUser(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return user;
    }
    @RequestMapping(value="/del/{id}")
    private String delUser(@PathVariable("id") Integer id)
    {
    	User user=new User();
    	user=userService.getUser(id);
    	user.setPwd("0");
    	try {
			userService.upUser(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return "redirect:/User/getall";
    }
    @ResponseBody
    @RequestMapping(value = "/registeryz")
    private User register(String name){
    	logger.info(name);
    	User user = userService.selectByname(name);
    	if(user == null)
    	{
    		user = new User();
    	}
    	return user;
    	
    }

}
