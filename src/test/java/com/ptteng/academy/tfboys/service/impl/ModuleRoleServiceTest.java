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

import com.ptteng.academy.tfboys.model.ModuleRole;
import com.ptteng.academy.tfboys.service.ModuleRoleService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class ModuleRoleServiceTest {

	private static final Log log = LogFactory.getLog(ModuleRoleServiceTest.class);
	
	private ModuleRoleService moduleRoleService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        moduleRoleService = (ModuleRoleService) context.getBean("moduleRoleService");
			//local server
			/**
			moduleRoleService = (ModuleRoleService)  Naming.lookup("//localhost:8888/ModuleRoleRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 moduleRoleService = (ModuleRoleService) context.getBean("moduleRoleService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  ModuleRole moduleRole  = new ModuleRole();	   
	   					 
			   					                moduleRole.setRoleID(1L);
            
			   					                moduleRole.setModuleID(1L);
            
			   					                moduleRole.setCreateBy("admin1");
            
			   					                moduleRole.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.moduleRoleService.insert(moduleRole);

      moduleRole = this.moduleRoleService.getObjectById(id);

	  ModuleRole moduleRole2=this.moduleRoleService.getObjectById(id);
	    Assert.assertNotNull(moduleRole2);
	  
		// 2. 更改 
				 		 				 				   moduleRole.setRoleID(2L);
		    		 				 				   moduleRole.setModuleID(2L);
		    		 				 				   moduleRole.setCreateBy("admin11");
		    		 				 				   moduleRole.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.moduleRoleService.update(moduleRole);		
		Assert.assertEquals(true, success);
		 ModuleRole moduleRole3=this.moduleRoleService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.moduleRoleService.delete(id);	
		Assert.assertEquals(true, success);
		ModuleRole moduleRole4=this.moduleRoleService.getObjectById(id);
		Assert.assertNull(moduleRole4);
		
		//4.batchInsert
		 List<ModuleRole> list=new ArrayList<ModuleRole>();
	  	  ModuleRole moduleRole5  = new ModuleRole();	   
	   					 
			   					                moduleRole5.setRoleID(1L);
            
			   					                moduleRole5.setModuleID(1L);
            
			   					                moduleRole5.setCreateBy("admin1");
            
			   					                moduleRole5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(moduleRole5);	   
	  	  ModuleRole moduleRole6  = new ModuleRole();	   
	   					 
			   					                moduleRole6.setRoleID(2L);
            
			   					                moduleRole6.setModuleID(2L);
            
			   					                moduleRole6.setCreateBy("admin11");
            
			   					                moduleRole6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(moduleRole6);
	   List<ModuleRole> insertResults= this.moduleRoleService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(ModuleRole o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<ModuleRole> getResults= this.moduleRoleService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(ModuleRole o :insertResults){
			this.moduleRoleService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getModuleRoleIdsByRoleIDAndModuleID()throws ServiceException, ServiceDaoException{
	 List<ModuleRole> list=new ArrayList<ModuleRole>();
	  	  ModuleRole moduleRole1  = new ModuleRole();	   
	   					 
			   					                moduleRole1.setRoleID(1L);
            
			   					                moduleRole1.setModuleID(1L);
            
			   					                moduleRole1.setCreateBy("admin1");
            
			   					                moduleRole1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(moduleRole1);	
	  	  ModuleRole moduleRole2  = new ModuleRole();	   
	   					 
			   					                moduleRole2.setRoleID(2L);
            
			   					                moduleRole2.setModuleID(2L);
            
			   					                moduleRole2.setCreateBy("admin11");
            
			   					                moduleRole2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(moduleRole2);	  
	  List<ModuleRole> insertResults= this.moduleRoleService.insertList(list);
		
	
	   
		
	
		List<Long>  lists= moduleRoleService.getModuleRoleIdsByRoleIDAndModuleID(1L,1L,0,Integer.MAX_VALUE);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(ModuleRole o :insertResults){
			this.moduleRoleService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

