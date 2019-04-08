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
public class UserController extends ApplicationController {
	@Autowired
    private UserService userService;
    private static final Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping(value = "/CheckLogin")
    public String checkLogin(String name, String pwd, Model model, HttpServletRequest request) {
        logger.info("--" + name);
        logger.info("00" + pwd);
        if(name==""||name==null||pwd==""||pwd==null)
        {
        	  model.addAttribute("flag","账号或密码不能为空");
              return "../login";
        }
       // User user = userService.checkLogin(name,pwd);
        if (userService.checkLogin(name,pwd) != null)
        {
            request.getSession().setAttribute("user", userService.checkLogin(name,pwd));
            return "index";
        }
        else
        {
            model.addAttribute("flag","登录失败！账号或密码错误！");
            return "../login";
        }
        
    }
   
}
