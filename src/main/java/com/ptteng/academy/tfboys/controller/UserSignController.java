package com.ptteng.academy.tfboys.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ptteng.academy.tfboys.model.UserSign;
import com.ptteng.academy.tfboys.service.UserSignService;

/**
 * UserSign  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class UserSignController {
	private static final Log log = LogFactory.getLog(UserSignController.class);

	@Autowired
	private UserSignService userSignService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/userSign", method = RequestMethod.GET)
	public String getuserSignList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/userSign  to /userSign/view/userSignList");

		return "/academy-tfboys-service/userSign/view/userSignList";
	}
    
    

    
	
	@RequestMapping(value = "/c/userSign/{id}", method = RequestMethod.GET)
	public String getUserSign(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/userSign/" + id + "  to /userSign/view/userSignDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/userSign/view/userSignDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/userSign/{id}", method = RequestMethod.GET)
	public String getUserSignJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			UserSign userSign = userSignService.getObjectById(id);
			log.info("get userSign data is " + userSign);

			model.addAttribute("code", 0);

			model.addAttribute("userSign", userSign);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userSign error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userSign/json/userSignDetailJson";
	}

	@RequestMapping(value = "/a/userSign/{id}", method = RequestMethod.PUT)
	public String updateUserSignJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, UserSign userSign) throws Exception {
		
		log.info("update userSign : userSign= " + userSign);
		
		try {
			
			userSignService.update(userSign);

			model.addAttribute("code", 0);

			model.addAttribute("userSign", userSign);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update userSign error,id is  " + userSign.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/userSign", method = RequestMethod.POST)
	public String addUserSignJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, UserSign userSign) throws Exception {
		
		log.info("update userSign : userSign= " + userSign);
		
		try { 
			userSign.setId(null);

			userSignService.insert(userSign);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add userSign error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/userSign/{id}", method = RequestMethod.DELETE)
	public String deleteUserSignJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete userSign : id= " + id);
		try {
			userSignService.delete(id);

			log.info("add userSign success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete userSign error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/userSign", method = RequestMethod.GET)
	public String getMultiUserSignJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<UserSign> userSignList = userSignService.getObjectsByIds(idList);
			log.info("get  userSign data is " + userSignList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",userSignList.size());

			model.addAttribute("userSignList", userSignList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get userSign error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userSign/json/userSignListJson";
	}
	
	
	
	
	
}

