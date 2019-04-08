package com.te.controller;

import java.sql.Date;

import javax.jms.Session;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.te.model.FriendCycle;
import com.te.model.Old;
import com.te.model.result.ApiResult;
import com.te.service.FriendcycleService;
import com.te.service.OldService;
import com.te.util.ProcessResultEnum;

@Controller
@RequestMapping(value = "/old")
public class OldController extends ApplicationController {
	@Autowired
    private  OldService oldService;
	@Autowired
	private FriendcycleService friendcycleService;
    private static final Logger logger = Logger.getLogger(OldController.class);
    @RequestMapping(value="/get")
    public String get (int id,Model model)
    {
    	
    	Old old=oldService.get(id);
    	ApiResult friendCycle=friendcycleService.getall(id);
        model.addAttribute("friendCycle",friendCycle.getData());

    	 request.getSession().setAttribute("old", old);
    	return "oldinformation";
    }
    @ResponseBody//返回对象
    @RequestMapping(value = "/update")
    public Old update(int oldid,String age,String birthday,String sex,Model model)
    {
    	int flag=0;
    	Old old=new Old();
    	old.setAge(age);
    	old.setBirthday(birthday);
    	old.setId(oldid);
    	old.setSex(sex);
    	
    	try {
        	flag=oldService.update(old);
        	if(flag == 1) {//success
    			model.addAttribute("flag",ProcessResultEnum.RETURN_RESULT_SUCCESS);
    			
            }
            else {
            	model.addAttribute("flag",ProcessResultEnum.RETURN_RESULT_FAILED);
            }
        }
    	catch (Exception e) {
    		logger.error("修改失败" + e.toString());

    		// TODO: handle exception
		}
    	return old;
    }
    @ResponseBody//返回对象
    @RequestMapping(value = "/getpl")
    public Object getpl(int friendCycleId)
    {
    	ApiResult friendCyclePl=friendcycleService.getpl(friendCycleId);
    	logger.info("akdjflkjadfli");
    	return friendCyclePl.getData();

    }
    @ResponseBody
    @RequestMapping(value="/subhf")
    public FriendCycle subhf(int pid,String pname,String content,int friendid,String name)
    {
    	FriendCycle friendCycle=new FriendCycle();
    	friendCycle.setParentId(pid);
    	friendCycle.setPname(pname);
    	friendCycle.setContent(content);
    	friendCycle.setFriendCycleArticleId(friendid);
    	friendCycle.setName(name);
    	int flag=0;
    	try {
			flag=friendcycleService.insert(friendCycle);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return friendCycle;
    }
}