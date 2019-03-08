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
     //分页显示列表
     @RequestMapping("/page")
     public ModelAndView showlist(HttpServletRequest request, Model model) {
         int pageIndex = 1;//设置初始的当前页，页面显示的都是第一页
         int pageSize = 10;//设置每一页显示几条数据,用于计算总页数，此处设置的值必须与sql语句的limit最后的数值一样
         PageUtil<User> pageUtil = new PageUtil<User>();//初始化工具类
         List<User> list = new ArrayList<User>();
         if (request.getParameter("pageIndex") != null) {
             pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
         }//对页面上的分页标签传的值,进行获取,也是就点击'上一页或者下一页'传过来的pageindex
         pageUtil.setPageIndex(pageIndex);//保存至工具类
         int number = service.pagecount();//调用service层方法计算出总数据量，就是多少条数据.
         pageUtil.setPageNumber(number);//保存至工具类
         pageUtil.setPageSize(pageSize);//保存至工具类
         pageUtil.setPageCount((int) Math.ceil((double) (pageUtil
                 .getPageNumber() / pageUtil.getPageSize())) + 1);//计算出总页数,并封装到工具类
         int index = (pageIndex - 1) * pageSize;//计算出每一页从数据库中第几条数据开始取值，也就是limit后面的第一个数字
         list = service.showlist(index);//调用service层的方法，取得数据库中的值
         pageUtil.setList(list);//保存到工具类中的集合
         model.addAttribute("pageUtil", pageUtil);//传递到页面，存入值栈中
         return new ModelAndView("menpage");//跳转的相关页面
        }
        @ResponseBody
    	@RequestMapping("/wushuaxinfenye")
    	public String wushuaxinfenye(HttpServletRequest request,@RequestParam(value = "currentPage", required = false) Integer currentPage,@RequestParam(value = "typeid", required = false) String typeid,Model model) throws Exception{
    		if (currentPage == null || currentPage == 0) {
    			currentPage = 1;
    		}
    		PageInfo<Information> pageInfo = new PageInfo<Information>();
    		pageInfo.setPageSize(6);
    		pageInfo.setCurrentPage(currentPage);
    		List<Information> informationList=this.informationBiz.findInformationAll(pageInfo.getForm(), pageInfo.getPageSize(), typeid);
    		Integer totalRecord = this.informationBiz.informationCount(typeid);
    		List<Infortype> inforTypeList=this.infortypeBiz.findAll();
    		pageInfo.setTotalRecord(totalRecord);
    		pageInfo.setTlist(informationList);
    		model.addAttribute("pageInfo", pageInfo);
    		model.addAttribute("inforTypeList", inforTypeList);
    		model.addAttribute("informationList", informationList);
    		return JSON.toJSONString(pageInfo);
    	}
}
