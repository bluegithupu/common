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

import com.ptteng.academy.tfboys.model.UserArticle;
import com.ptteng.academy.tfboys.service.UserArticleService;

/**
 * UserArticle  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class UserArticleController {
	private static final Log log = LogFactory.getLog(UserArticleController.class);

	@Autowired
	private UserArticleService userArticleService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/userArticle", method = RequestMethod.GET)
	public String getuserArticleList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/userArticle  to /userArticle/view/userArticleList");

		return "/academy-tfboys-service/userArticle/view/userArticleList";
	}
    
    

    		
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 
	
		 @RequestMapping(value = "/c/userArticle1 ", method = RequestMethod.GET)
	public String getUserArticleIdsByCollectionStatusAndUserIDList1(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,Integer collectionStatus,Long userID) throws Exception {

		log.info("/userArticle  to /userArticle/view/userArticleList");

		return "/academy-tfboys-service/userArticle/view/userArticleList";
	}

	
	
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 
	
		 @RequestMapping(value = "/c/userArticle2 ", method = RequestMethod.GET)
	public String getUserArticleIdsByLikedStatusAndUserIDList2(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,Integer likedStatus,Long userID) throws Exception {

		log.info("/userArticle  to /userArticle/view/userArticleList");

		return "/academy-tfboys-service/userArticle/view/userArticleList";
	}

	
	
	
	
	
	
	@RequestMapping(value = "/c/userArticle/{id}", method = RequestMethod.GET)
	public String getUserArticle(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/userArticle/" + id + "  to /userArticle/view/userArticleDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/userArticle/view/userArticleDetail";
	}
	
	
	
	    		
			
    /**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	
		@RequestMapping(value = "/a/userArticle1 ", method = RequestMethod.GET)
	public String getUserArticleIdsByCollectionStatusAndUserIDJsonList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Integer page,
			Integer size,Integer collectionStatus,Long userID) throws Exception {


		if (page == null) {
			page = 1;
		}
		if (size == null) {
			size = 10;
		}
		int start = (page - 1) * size;
		if (start < 0) {
			start = 0;
		}

		log.info("pageList : page= " + start + " , size=" + size);

		try {

			List<Long> ids= userArticleService.getUserArticleIdsByCollectionStatusAndUserID(collectionStatus,userID,start,size);
		log.info("get countUserArticleIdsByCollectionStatusAndUserID size is " + ids.size());

			List<UserArticle> userArticleList = userArticleService.getObjectsByIds(ids);
			log.info("get userArticle data is " + userArticleList.size());

			Integer total = userArticleService. countUserArticleIdsByCollectionStatusAndUserID(collectionStatus,userID);
			log.info("get userArticle count is " + total);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			
			model.addAttribute("total", total);

			model.addAttribute("userArticleList", userArticleList);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userArticle list error,page is  " + start + " , size "
					+ size);
			// for test
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userArticle/json/userArticleListJson";
	}

	
	
		
			
			
    /**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	
		@RequestMapping(value = "/a/userArticle2 ", method = RequestMethod.GET)
	public String getUserArticleIdsByLikedStatusAndUserIDJsonList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Integer page,
			Integer size,Integer likedStatus,Long userID) throws Exception {


		if (page == null) {
			page = 1;
		}
		if (size == null) {
			size = 10;
		}
		int start = (page - 1) * size;
		if (start < 0) {
			start = 0;
		}

		log.info("pageList : page= " + start + " , size=" + size);

		try {

			List<Long> ids= userArticleService.getUserArticleIdsByLikedStatusAndUserID(likedStatus,userID,start,size);
		log.info("get countUserArticleIdsByLikedStatusAndUserID size is " + ids.size());

			List<UserArticle> userArticleList = userArticleService.getObjectsByIds(ids);
			log.info("get userArticle data is " + userArticleList.size());

			Integer total = userArticleService. countUserArticleIdsByLikedStatusAndUserID(likedStatus,userID);
			log.info("get userArticle count is " + total);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			
			model.addAttribute("total", total);

			model.addAttribute("userArticleList", userArticleList);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userArticle list error,page is  " + start + " , size "
					+ size);
			// for test
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userArticle/json/userArticleListJson";
	}

	
	
		
	
	

	@RequestMapping(value = "/a/userArticle/{id}", method = RequestMethod.GET)
	public String getUserArticleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			UserArticle userArticle = userArticleService.getObjectById(id);
			log.info("get userArticle data is " + userArticle);

			model.addAttribute("code", 0);

			model.addAttribute("userArticle", userArticle);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userArticle error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userArticle/json/userArticleDetailJson";
	}

	@RequestMapping(value = "/a/userArticle/{id}", method = RequestMethod.PUT)
	public String updateUserArticleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, UserArticle userArticle) throws Exception {
		
		log.info("update userArticle : userArticle= " + userArticle);
		
		try {
			
			userArticleService.update(userArticle);

			model.addAttribute("code", 0);

			model.addAttribute("userArticle", userArticle);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update userArticle error,id is  " + userArticle.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/userArticle", method = RequestMethod.POST)
	public String addUserArticleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, UserArticle userArticle) throws Exception {
		
		log.info("update userArticle : userArticle= " + userArticle);
		
		try { 
			userArticle.setId(null);

			userArticleService.insert(userArticle);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add userArticle error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/userArticle/{id}", method = RequestMethod.DELETE)
	public String deleteUserArticleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete userArticle : id= " + id);
		try {
			userArticleService.delete(id);

			log.info("add userArticle success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete userArticle error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/userArticle", method = RequestMethod.GET)
	public String getMultiUserArticleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<UserArticle> userArticleList = userArticleService.getObjectsByIds(idList);
			log.info("get  userArticle data is " + userArticleList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",userArticleList.size());

			model.addAttribute("userArticleList", userArticleList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get userArticle error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userArticle/json/userArticleListJson";
	}
	
	
	
	
	
}

