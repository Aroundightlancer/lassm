package com.te.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.model.OldUser;
import com.te.model.result.ApiResult;
import com.te.service.OlduserService;

@Controller
@RequestMapping(value = "/Olduser")
public class OlduserController extends ApplicationController {
	@Autowired
    private OlduserService olduserService;

    private static final Logger logger = Logger.getLogger(OlduserController.class);
    @RequestMapping(value = "/get")
    public String get(Integer id,Integer oldId,Model model)
    {
        ApiResult oldusers = olduserService.getall(id);
        model.addAttribute("oldusers",oldusers.getData());
        System.out.println(oldusers.getData());
    	return "oldUser";
    	
    }

}
