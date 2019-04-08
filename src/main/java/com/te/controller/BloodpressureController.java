package com.te.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.model.result.ApiResult;
import com.te.service.BloodpressureService;
import com.te.service.OlduserService;

@Controller
@RequestMapping(value = "/blood")
public class BloodpressureController extends ApplicationController {
	@Autowired
    private BloodpressureService bloodpressureService;

    private static final Logger logger = Logger.getLogger(OlduserController.class);
    @RequestMapping(value = "/get")
    public String get(Integer id,Integer oldId,Model model)
    {
        ApiResult bloods = bloodpressureService.getall(oldId);
        model.addAttribute("blood",bloods.getData());
        System.out.println(bloods.getData());
    	return "bloodPressure";
    	
    }

}
