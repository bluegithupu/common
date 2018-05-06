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

import com.ptteng.academy.tfboys.model.UserVideo;
import com.ptteng.academy.tfboys.service.UserVideoService;

/**
 * UserVideo  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class UserVideoController {
	private static final Log log = LogFactory.getLog(UserVideoController.class);

	@Autowired
	private UserVideoService userVideoService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/userVideo", method = RequestMethod.GET)
	public String getuserVideoList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/userVideo  to /userVideo/view/userVideoList");

		return "/academy-tfboys-service/userVideo/view/userVideoList";
	}
    
    

    		
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 
	
		 @RequestMapping(value = "/c/userVideo1 ", method = RequestMethod.GET)
	public String getUserVideoIdsByLikedStatusAndUserIDList1(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,Integer likedStatus,Long userID) throws Exception {

		log.info("/userVideo  to /userVideo/view/userVideoList");

		return "/academy-tfboys-service/userVideo/view/userVideoList";
	}

	
	
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 
	
		 @RequestMapping(value = "/c/userVideo2 ", method = RequestMethod.GET)
	public String getUserVideoIdsByCollectionStatusAndUserIDList2(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,Integer collectionStatus,Long userID) throws Exception {

		log.info("/userVideo  to /userVideo/view/userVideoList");

		return "/academy-tfboys-service/userVideo/view/userVideoList";
	}

	
	
	
	
	
	
	@RequestMapping(value = "/c/userVideo/{id}", method = RequestMethod.GET)
	public String getUserVideo(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/userVideo/" + id + "  to /userVideo/view/userVideoDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/userVideo/view/userVideoDetail";
	}
	
	
	
	    		
			
    /**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	
		@RequestMapping(value = "/a/userVideo1 ", method = RequestMethod.GET)
	public String getUserVideoIdsByLikedStatusAndUserIDJsonList(HttpServletRequest request,
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

			List<Long> ids= userVideoService.getUserVideoIdsByLikedStatusAndUserID(likedStatus,userID,start,size);
		log.info("get countUserVideoIdsByLikedStatusAndUserID size is " + ids.size());

			List<UserVideo> userVideoList = userVideoService.getObjectsByIds(ids);
			log.info("get userVideo data is " + userVideoList.size());

			Integer total = userVideoService. countUserVideoIdsByLikedStatusAndUserID(likedStatus,userID);
			log.info("get userVideo count is " + total);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			
			model.addAttribute("total", total);

			model.addAttribute("userVideoList", userVideoList);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userVideo list error,page is  " + start + " , size "
					+ size);
			// for test
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userVideo/json/userVideoListJson";
	}

	
	
		
			
			
    /**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	
		@RequestMapping(value = "/a/userVideo2 ", method = RequestMethod.GET)
	public String getUserVideoIdsByCollectionStatusAndUserIDJsonList(HttpServletRequest request,
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

			List<Long> ids= userVideoService.getUserVideoIdsByCollectionStatusAndUserID(collectionStatus,userID,start,size);
		log.info("get countUserVideoIdsByCollectionStatusAndUserID size is " + ids.size());

			List<UserVideo> userVideoList = userVideoService.getObjectsByIds(ids);
			log.info("get userVideo data is " + userVideoList.size());

			Integer total = userVideoService. countUserVideoIdsByCollectionStatusAndUserID(collectionStatus,userID);
			log.info("get userVideo count is " + total);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			
			model.addAttribute("total", total);

			model.addAttribute("userVideoList", userVideoList);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userVideo list error,page is  " + start + " , size "
					+ size);
			// for test
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userVideo/json/userVideoListJson";
	}

	
	
		
	
	

	@RequestMapping(value = "/a/userVideo/{id}", method = RequestMethod.GET)
	public String getUserVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			UserVideo userVideo = userVideoService.getObjectById(id);
			log.info("get userVideo data is " + userVideo);

			model.addAttribute("code", 0);

			model.addAttribute("userVideo", userVideo);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get userVideo error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userVideo/json/userVideoDetailJson";
	}

	@RequestMapping(value = "/a/userVideo/{id}", method = RequestMethod.PUT)
	public String updateUserVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, UserVideo userVideo) throws Exception {
		
		log.info("update userVideo : userVideo= " + userVideo);
		
		try {
			
			userVideoService.update(userVideo);

			model.addAttribute("code", 0);

			model.addAttribute("userVideo", userVideo);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update userVideo error,id is  " + userVideo.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/userVideo", method = RequestMethod.POST)
	public String addUserVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, UserVideo userVideo) throws Exception {
		
		log.info("update userVideo : userVideo= " + userVideo);
		
		try { 
			userVideo.setId(null);

			userVideoService.insert(userVideo);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add userVideo error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/userVideo/{id}", method = RequestMethod.DELETE)
	public String deleteUserVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete userVideo : id= " + id);
		try {
			userVideoService.delete(id);

			log.info("add userVideo success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete userVideo error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/userVideo", method = RequestMethod.GET)
	public String getMultiUserVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<UserVideo> userVideoList = userVideoService.getObjectsByIds(idList);
			log.info("get  userVideo data is " + userVideoList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",userVideoList.size());

			model.addAttribute("userVideoList", userVideoList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get userVideo error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/userVideo/json/userVideoListJson";
	}
	
	
	
	
	
}

