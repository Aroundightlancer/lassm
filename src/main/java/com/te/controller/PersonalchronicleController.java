package com.te.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.model.result.ApiResult;
import com.te.service.BloodpressureService;
import com.te.service.OlduserService;
import com.te.service.PersonalchronicleService;

@Controller
@RequestMapping(value = "/person")
public class PersonalchronicleController extends ApplicationController {
	@Autowired
    private PersonalchronicleService personalchronicleService;

    private static final Logger logger = Logger.getLogger(OlduserController.class);
    @RequestMapping(value = "/get")
    public String get(Integer id,Integer oldId,Model model)
    {
        ApiResult persons = personalchronicleService.getall(oldId);
        model.addAttribute("persons",persons.getData());
//        System.out.println(bloods.getData());
    	return "ImportantEvents";
    	
    }

}
