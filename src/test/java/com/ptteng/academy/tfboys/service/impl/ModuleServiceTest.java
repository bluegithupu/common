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

import com.ptteng.academy.tfboys.model.Module;
import com.ptteng.academy.tfboys.service.ModuleService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class ModuleServiceTest {

	private static final Log log = LogFactory.getLog(ModuleServiceTest.class);
	
	private ModuleService moduleService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        moduleService = (ModuleService) context.getBean("moduleService");
			//local server
			/**
			moduleService = (ModuleService)  Naming.lookup("//localhost:8888/ModuleRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 moduleService = (ModuleService) context.getBean("moduleService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Module module  = new Module();	   
	   					 
			   					                module.setName("体育馆");
            
			   					                module.setUrl("www.baidu.com");
            
			   					                module.setParentID(1L);
            
			   					                module.setCreateBy("admin1");
            
			   					                module.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.moduleService.insert(module);

      module = this.moduleService.getObjectById(id);

	  Module module2=this.moduleService.getObjectById(id);
	    Assert.assertNotNull(module2);
	  
		// 2. 更改 
				 		 				 				   module.setName("树洞");
		    		 				 				   module.setUrl("www.baidu1.com");
		    		 				 				   module.setParentID(2L);
		    		 				 				   module.setCreateBy("admin11");
		    		 				 				   module.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.moduleService.update(module);		
		Assert.assertEquals(true, success);
		 Module module3=this.moduleService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.moduleService.delete(id);	
		Assert.assertEquals(true, success);
		Module module4=this.moduleService.getObjectById(id);
		Assert.assertNull(module4);
		
		//4.batchInsert
		 List<Module> list=new ArrayList<Module>();
	  	  Module module5  = new Module();	   
	   					 
			   					                module5.setName("体育馆");
            
			   					                module5.setUrl("www.baidu.com");
            
			   					                module5.setParentID(1L);
            
			   					                module5.setCreateBy("admin1");
            
			   					                module5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(module5);	   
	  	  Module module6  = new Module();	   
	   					 
			   					                module6.setName("树洞");
            
			   					                module6.setUrl("www.baidu1.com");
            
			   					                module6.setParentID(2L);
            
			   					                module6.setCreateBy("admin11");
            
			   					                module6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(module6);
	   List<Module> insertResults= this.moduleService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Module o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Module> getResults= this.moduleService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Module o :insertResults){
			this.moduleService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getModuleNameById()throws ServiceException, ServiceDaoException{
	 List<Module> list=new ArrayList<Module>();
	  	  Module module1  = new Module();	   
	   					 
			   					                module1.setName("体育馆");
            
			   					                module1.setUrl("www.baidu.com");
            
			   					                module1.setParentID(1L);
            
			   					                module1.setCreateBy("admin1");
            
			   					                module1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(module1);	
	  	  Module module2  = new Module();	   
	   					 
			   					                module2.setName("树洞");
            
			   					                module2.setUrl("www.baidu1.com");
            
			   					                module2.setParentID(2L);
            
			   					                module2.setCreateBy("admin11");
            
			   					                module2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(module2);	  
	  List<Module> insertResults= this.moduleService.insertList(list);
		
	
	   
		
	
		String  lists= moduleService.getModuleNameById(1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(Module o :insertResults){
			this.moduleService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

