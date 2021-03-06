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

import com.ptteng.academy.tfboys.model.TemporaryData;
import com.ptteng.academy.tfboys.service.TemporaryDataService;

/**
 * TemporaryData  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class TemporaryDataController {
	private static final Log log = LogFactory.getLog(TemporaryDataController.class);

	@Autowired
	private TemporaryDataService temporaryDataService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/temporaryData", method = RequestMethod.GET)
	public String gettemporaryDataList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/temporaryData  to /temporaryData/view/temporaryDataList");

		return "/academy-tfboys-service/temporaryData/view/temporaryDataList";
	}
    
    

    
	
	@RequestMapping(value = "/c/temporaryData/{id}", method = RequestMethod.GET)
	public String getTemporaryData(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/temporaryData/" + id + "  to /temporaryData/view/temporaryDataDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/temporaryData/view/temporaryDataDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/temporaryData/{id}", method = RequestMethod.GET)
	public String getTemporaryDataJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			TemporaryData temporaryData = temporaryDataService.getObjectById(id);
			log.info("get temporaryData data is " + temporaryData);

			model.addAttribute("code", 0);

			model.addAttribute("temporaryData", temporaryData);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get temporaryData error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/temporaryData/json/temporaryDataDetailJson";
	}

	@RequestMapping(value = "/a/temporaryData/{id}", method = RequestMethod.PUT)
	public String updateTemporaryDataJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, TemporaryData temporaryData) throws Exception {
		
		log.info("update temporaryData : temporaryData= " + temporaryData);
		
		try {
			
			temporaryDataService.update(temporaryData);

			model.addAttribute("code", 0);

			model.addAttribute("temporaryData", temporaryData);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update temporaryData error,id is  " + temporaryData.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/temporaryData", method = RequestMethod.POST)
	public String addTemporaryDataJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, TemporaryData temporaryData) throws Exception {
		
		log.info("update temporaryData : temporaryData= " + temporaryData);
		
		try { 
			temporaryData.setId(null);

			temporaryDataService.insert(temporaryData);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add temporaryData error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/temporaryData/{id}", method = RequestMethod.DELETE)
	public String deleteTemporaryDataJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete temporaryData : id= " + id);
		try {
			temporaryDataService.delete(id);

			log.info("add temporaryData success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete temporaryData error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/temporaryData", method = RequestMethod.GET)
	public String getMultiTemporaryDataJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<TemporaryData> temporaryDataList = temporaryDataService.getObjectsByIds(idList);
			log.info("get  temporaryData data is " + temporaryDataList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",temporaryDataList.size());

			model.addAttribute("temporaryDataList", temporaryDataList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get temporaryData error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/temporaryData/json/temporaryDataListJson";
	}
	
	
	
	
	
}

