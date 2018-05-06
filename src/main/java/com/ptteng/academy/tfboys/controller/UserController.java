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

import com.ptteng.academy.tfboys.model.User;
import com.ptteng.academy.tfboys.service.UserService;

/**
 * User  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class UserController {
	private static final Log log = LogFactory.getLog(UserController.class);

	@Autowired
	private UserService userService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/user", method = RequestMethod.GET)
	public String getuserList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/user  to /user/view/userList");

		return "/academy-tfboys-service/user/view/userList";
	}
    
    

    
	
	@RequestMapping(value = "/c/user/{id}", method = RequestMethod.GET)
	public String getUser(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/user/" + id + "  to /user/view/userDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/user/view/userDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/user/{id}", method = RequestMethod.GET)
	public String getUserJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			User user = userService.getObjectById(id);
			log.info("get user data is " + user);

			model.addAttribute("code", 0);

			model.addAttribute("user", user);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get user error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/user/json/userDetailJson";
	}

	@RequestMapping(value = "/a/user/{id}", method = RequestMethod.PUT)
	public String updateUserJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, User user) throws Exception {
		
		log.info("update user : user= " + user);
		
		try {
			
			userService.update(user);

			model.addAttribute("code", 0);

			model.addAttribute("user", user);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update user error,id is  " + user.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/user", method = RequestMethod.POST)
	public String addUserJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, User user) throws Exception {
		
		log.info("update user : user= " + user);
		
		try { 
			user.setId(null);

			userService.insert(user);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add user error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/user/{id}", method = RequestMethod.DELETE)
	public String deleteUserJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete user : id= " + id);
		try {
			userService.delete(id);

			log.info("add user success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete user error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/user", method = RequestMethod.GET)
	public String getMultiUserJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<User> userList = userService.getObjectsByIds(idList);
			log.info("get  user data is " + userList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",userList.size());

			model.addAttribute("userList", userList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get user error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/user/json/userListJson";
	}
	
	
	
	
	
}

