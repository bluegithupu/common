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

import com.ptteng.academy.tfboys.model.Teacher;
import com.ptteng.academy.tfboys.service.TeacherService;

/**
 * Teacher  crud
 * 
 * @author magenm
 * @Date 2014-4-16 13:43
 * 
 */
@Controller
public class TeacherController {
	private static final Log log = LogFactory.getLog(TeacherController.class);

	@Autowired
	private TeacherService teacherService;






    /**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */

	@RequestMapping(value = "/c/teacher", method = RequestMethod.GET)
	public String getteacherList(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) throws Exception {

		
		
		log.info("/teacher  to /teacher/view/teacherList");

		return "/academy-tfboys-service/teacher/view/teacherList";
	}
    
    

    
	
	@RequestMapping(value = "/c/teacher/{id}", method = RequestMethod.GET)
	public String getTeacher(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("/teacher/" + id + "  to /teacher/view/teacherDeail");
		if(null != id){
			model.addAttribute("id", id);
		}else{
			model.addAttribute("id", 0);
		}

		return "/academy-tfboys-service/teacher/view/teacherDetail";
	}
	
	
	
	    
	

	@RequestMapping(value = "/a/teacher/{id}", method = RequestMethod.GET)
	public String getTeacherJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("get data : id= " + id);
		try {
			Teacher teacher = teacherService.getObjectById(id);
			log.info("get teacher data is " + teacher);

			model.addAttribute("code", 0);

			model.addAttribute("teacher", teacher);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("get teacher error,id is  " + id);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/teacher/json/teacherDetailJson";
	}

	@RequestMapping(value = "/a/teacher/{id}", method = RequestMethod.PUT)
	public String updateTeacherJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Teacher teacher) throws Exception {
		
		log.info("update teacher : teacher= " + teacher);
		
		try {
			
			teacherService.update(teacher);

			model.addAttribute("code", 0);

			model.addAttribute("teacher", teacher);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("update teacher error,id is  " + teacher.getId());
			model.addAttribute("code", -6003);

		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/teacher", method = RequestMethod.POST)
	public String addTeacherJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Teacher teacher) throws Exception {
		
		log.info("update teacher : teacher= " + teacher);
		
		try { 
			teacher.setId(null);

			teacherService.insert(teacher);

			model.addAttribute("code", 0);
		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("add teacher error ");
			model.addAttribute("code", -6002);
		}

		return "/data/json";
	}

	@RequestMapping(value = "/a/teacher/{id}", method = RequestMethod.DELETE)
	public String deleteTeacherJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, @PathVariable Long id)
			throws Exception {

		log.info("delete teacher : id= " + id);
		try {
			teacherService.delete(id);

			log.info("add teacher success");
			model.addAttribute("code", 0);

		} catch (Throwable t) {
		    t.printStackTrace();
			log.error(t.getMessage());
			log.error("delete teacher error,id is  " + id);
			model.addAttribute("code", -6004);

		}

		return "/data/json";
	}
	
	
	@RequestMapping(value = "/a/multi/teacher", method = RequestMethod.GET)
	public String getMultiTeacherJson(HttpServletRequest request,
			HttpServletResponse response, ModelMap model, Long[] ids)
			throws Exception {
			
		List<Long> idList = new ArrayList();	
	   if (ids == null) {

		} else {
			idList = Arrays.asList(ids);
		}
		try {

			

			List<Teacher> teacherList = teacherService.getObjectsByIds(idList);
			log.info("get  teacher data is " + teacherList);

			model.addAttribute("code", 0);			
			model.addAttribute("total",teacherList.size());

			model.addAttribute("teacherList", teacherList);

		} catch (Throwable t) {
			log.error(t.getMessage());
			log.error("get teacher error,id is  " + idList);
			model.addAttribute("code", -100000);
		}

		return "/academy-tfboys-service/teacher/json/teacherListJson";
	}
	
	
	
	
	
}

