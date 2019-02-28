package com.te.controller;

import java.util.List;

import com.te.model.result.ApiResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.te.model.Menu;
import com.te.service.MenuService;
import com.te.service.UserService;

@Controller
@RequestMapping(value = "/menu")
public class MenuController {
	@Autowired
    private MenuService menuService;

    private static final Logger logger = Logger.getLogger(MenuController.class);

    @RequestMapping(value = "/getChild")
    @ResponseBody
    public ApiResult getchild(@RequestParam(value = "parentId") Integer parentId, @RequestParam(value = "userType") Integer userType)
    {
        ApiResult apiResult = menuService.getChild(parentId, userType);
    	return apiResult;
    }
}