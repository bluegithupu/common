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

import com.ptteng.academy.tfboys.model.ModuleRole;
import com.ptteng.academy.tfboys.service.ModuleRoleService;

/**
 * ModuleRole  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class ModuleRoleController {
	private static final Log log = LogFactory.getLog(ModuleRoleController.class);

	@Autowired
	private ModuleRoleService moduleRoleService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/moduleRole", method = RequestMethod.GET)
	public String getmoduleRoleList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/moduleRole  to /moduleRole/view/moduleRoleList");

		return "/academy-tfboys-service/moduleRole/view/moduleRoleList";
	}
    
    

    		
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 
	
		 @RequestMapping(value = "/c/moduleRole1 ", method = RequestMethod.GET)
	public String getModuleRoleIdsByRoleIDAndModuleIDList1(HttpServletRequest request,
			HttpServletResponse response, ModelMap model,Long roleID,Long moduleID) throws Exception {

		log.info("/moduleRole  to /moduleRole/view/moduleRoleList");

		return "/academy-tfboys-service/moduleRole/view/moduleRoleList";
	}

	
	
	
	
	
	
	@RequestMapping(value = "/c/moduleRole/{id}", method = RequestMethod.GET)
	public String getModuleRole(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/moduleRole/" + id + "  to /moduleRole/view/moduleRoleDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/moduleRole/view/moduleRoleDetail";
	}
	
	
	
	    		
			
    /**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	
		@RequestMapping(value = "/a/moduleRole1 ", method = RequestMethod.GET)
	public String getModuleRoleIdsByRoleIDAndModuleIDJsonList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Integer page,
			Integer size,Long roleID,Long moduleID) throws Exception {


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

			List<Long> ids= moduleRoleService.getModuleRoleIdsByRoleIDAndModuleID(roleID,moduleID,start,size);
		log.info("get countModuleRoleIdsByRoleIDAndModuleID size is " + ids.size());

			List<ModuleRole> moduleRoleList = moduleRoleService.getObjectsByIds(ids);
			log.info("get moduleRole data is " + moduleRoleList.size());

			Integer total = moduleRoleService. countModuleRoleIdsByRoleIDAndModuleID(roleID,moduleID);
			log.info("get moduleRole count is " + total);

			model.addAttribute("code", 0);
			model.addAttribute("page", page);
			model.addAttribute("size", size);
			
			model.addAttribute("total", total);

			model.addAttribute("moduleRoleList", moduleRoleList);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get moduleRole list error,page is  " + start + " , size "
					+ size);
			// for test
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/moduleRole/json/moduleRoleListJson";
	}

	
	
		
	
	

	@RequestMapping(value = "/a/moduleRole/{id}", method = RequestMethod.GET)
	public String getModuleRoleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			ModuleRole moduleRole = moduleRoleService.getObjectById(id);
			log.info("get moduleRole data is " + moduleRole);

			model.addAttribute("code", 0);

			model.addAttribute("moduleRole", moduleRole);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get moduleRole error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/moduleRole/json/moduleRoleDetailJson";
	}

	@RequestMapping(value = "/a/moduleRole/{id}", method = RequestMethod.PUT)
	public String updateModuleRoleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, ModuleRole moduleRole) throws Exception {
		
		log.info("update moduleRole : moduleRole= " + moduleRole);
		
		try {
			
			moduleRoleService.update(moduleRole);

			model.addAttribute("code", 0);

			model.addAttribute("moduleRole", moduleRole);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update moduleRole error,id is  " + moduleRole.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/moduleRole", method = RequestMethod.POST)
	public String addModuleRoleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, ModuleRole moduleRole) throws Exception {
		
		log.info("update moduleRole : moduleRole= " + moduleRole);
		
		try { 
			moduleRole.setId(null);

			moduleRoleService.insert(moduleRole);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add moduleRole error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/moduleRole/{id}", method = RequestMethod.DELETE)
	public String deleteModuleRoleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete moduleRole : id= " + id);
		try {
			moduleRoleService.delete(id);

			log.info("add moduleRole success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete moduleRole error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/moduleRole", method = RequestMethod.GET)
	public String getMultiModuleRoleJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<ModuleRole> moduleRoleList = moduleRoleService.getObjectsByIds(idList);
			log.info("get  moduleRole data is " + moduleRoleList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",moduleRoleList.size());

			model.addAttribute("moduleRoleList", moduleRoleList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get moduleRole error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/moduleRole/json/moduleRoleListJson";
	}
	
	
	
	
	
}

