package com.ptteng.academy.tfboys.service.impl;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Before;
import java.rmi.Naming;

import com.ptteng.academy.tfboys.model.Teacher;
import com.ptteng.academy.tfboys.service.TeacherService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class TeacherServiceTest {

	private static final Log log = LogFactory.getLog(TeacherServiceTest.class);
	
	private TeacherService teacherService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        teacherService = (TeacherService) context.getBean("teacherService");
			//local server
			/**
			teacherService = (TeacherService)  Naming.lookup("//localhost:8888/TeacherRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 teacherService = (TeacherService) context.getBean("teacherService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Teacher teacher  = new Teacher();	   
	   					 
			   					                teacher.setNickName("tony");
            
			   					                teacher.setAvatar("www.baidu.com");
            
			   					                teacher.setCreateBy("admin1");
            
			   					                teacher.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.teacherService.insert(teacher);

      teacher = this.teacherService.getObjectById(id);

	  Teacher teacher2=this.teacherService.getObjectById(id);
	    Assert.assertNotNull(teacher2);
	  
		// 2. 更改 
				 		 				 				   teacher.setNickName("mumu");
		    		 				 				   teacher.setAvatar("www.baidu1.com");
		    		 				 				   teacher.setCreateBy("admin11");
		    		 				 				   teacher.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.teacherService.update(teacher);		
		Assert.assertEquals(true, success);
		 Teacher teacher3=this.teacherService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.teacherService.delete(id);	
		Assert.assertEquals(true, success);
		Teacher teacher4=this.teacherService.getObjectById(id);
		Assert.assertNull(teacher4);
		
		//4.batchInsert
		 List<Teacher> list=new ArrayList<Teacher>();
	  	  Teacher teacher5  = new Teacher();	   
	   					 
			   					                teacher5.setNickName("tony");
            
			   					                teacher5.setAvatar("www.baidu.com");
            
			   					                teacher5.setCreateBy("admin1");
            
			   					                teacher5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(teacher5);	   
	  	  Teacher teacher6  = new Teacher();	   
	   					 
			   					                teacher6.setNickName("mumu");
            
			   					                teacher6.setAvatar("www.baidu1.com");
            
			   					                teacher6.setCreateBy("admin11");
            
			   					                teacher6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(teacher6);
	   List<Teacher> insertResults= this.teacherService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Teacher o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Teacher> getResults= this.teacherService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Teacher o :insertResults){
			this.teacherService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getTeacherNickNameById()throws ServiceException, ServiceDaoException{
	 List<Teacher> list=new ArrayList<Teacher>();
	  	  Teacher teacher1  = new Teacher();	   
	   					 
			   					                teacher1.setNickName("tony");
            
			   					                teacher1.setAvatar("www.baidu.com");
            
			   					                teacher1.setCreateBy("admin1");
            
			   					                teacher1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(teacher1);	
	  	  Teacher teacher2  = new Teacher();	   
	   					 
			   					                teacher2.setNickName("mumu");
            
			   					                teacher2.setAvatar("www.baidu1.com");
            
			   					                teacher2.setCreateBy("admin11");
            
			   					                teacher2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(teacher2);	  
	  List<Teacher> insertResults= this.teacherService.insertList(list);
		
	
	   
		
	
		String  lists= teacherService.getTeacherNickNameById(1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(Teacher o :insertResults){
			this.teacherService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

