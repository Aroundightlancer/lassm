package com.te.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.model.result.ApiResult;
import com.te.service.AllergyService;
import com.te.service.BloodpressureService;
import com.te.service.OlduserService;

@Controller
@RequestMapping(value = "/allergy")
public class AllergyController extends ApplicationController {
	@Autowired
    private AllergyService allergyService;

    private static final Logger logger = Logger.getLogger(OlduserController.class);
    @RequestMapping(value = "/get")
    public String get(Integer id,Integer oldId,Model model)
    {
        ApiResult allergy = allergyService.getall(oldId);
        model.addAttribute("allergy",allergy.getData());
    	return "allergy";
    }

}
