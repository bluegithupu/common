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

import com.ptteng.academy.tfboys.model.Video;
import com.ptteng.academy.tfboys.service.VideoService;

/**
 * Video  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class VideoController {
	private static final Log log = LogFactory.getLog(VideoController.class);

	@Autowired
	private VideoService videoService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/video", method = RequestMethod.GET)
	public String getvideoList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/video  to /video/view/videoList");

		return "/academy-tfboys-service/video/view/videoList";
	}
    
    

    
	
	@RequestMapping(value = "/c/video/{id}", method = RequestMethod.GET)
	public String getVideo(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/video/" + id + "  to /video/view/videoDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/video/view/videoDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/video/{id}", method = RequestMethod.GET)
	public String getVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			Video video = videoService.getObjectById(id);
			log.info("get video data is " + video);

			model.addAttribute("code", 0);

			model.addAttribute("video", video);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get video error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/video/json/videoDetailJson";
	}

	@RequestMapping(value = "/a/video/{id}", method = RequestMethod.PUT)
	public String updateVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Video video) throws Exception {
		
		log.info("update video : video= " + video);
		
		try {
			
			videoService.update(video);

			model.addAttribute("code", 0);

			model.addAttribute("video", video);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update video error,id is  " + video.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/video", method = RequestMethod.POST)
	public String addVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Video video) throws Exception {
		
		log.info("update video : video= " + video);
		
		try { 
			video.setId(null);

			videoService.insert(video);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add video error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/video/{id}", method = RequestMethod.DELETE)
	public String deleteVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete video : id= " + id);
		try {
			videoService.delete(id);

			log.info("add video success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete video error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/video", method = RequestMethod.GET)
	public String getMultiVideoJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<Video> videoList = videoService.getObjectsByIds(idList);
			log.info("get  video data is " + videoList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",videoList.size());

			model.addAttribute("videoList", videoList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get video error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/video/json/videoListJson";
	}
	
	
	
	
	
}

