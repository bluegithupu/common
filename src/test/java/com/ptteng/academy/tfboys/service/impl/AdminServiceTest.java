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

import com.ptteng.academy.tfboys.model.Admin;
import com.ptteng.academy.tfboys.service.AdminService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class AdminServiceTest {

	private static final Log log = LogFactory.getLog(AdminServiceTest.class);
	
	private AdminService adminService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        adminService = (AdminService) context.getBean("adminService");
			//local server
			/**
			adminService = (AdminService)  Naming.lookup("//localhost:8888/AdminRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 adminService = (AdminService) context.getBean("adminService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Admin admin  = new Admin();	   
	   					 
			   					                admin.setRoleID(1L);
            
			   					                admin.setSalt("adfasdf");
            
			   					                admin.setUserName("niutao1");
            
			   					                admin.setPassWord("niutao111");
            
			   					                admin.setPhone("13538039322");
            
			   					                admin.setCreateBy("admin1");
            
			   					                admin.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.adminService.insert(admin);

      admin = this.adminService.getObjectById(id);

	  Admin admin2=this.adminService.getObjectById(id);
	    Assert.assertNotNull(admin2);
	  
		// 2. 更改 
				 		 				 				   admin.setRoleID(2L);
		    		 				 				   admin.setSalt("sdfhgfdh");
		    		 				 				   admin.setUserName("niutao2");
		    		 				 				   admin.setPassWord("niutao222");
		    		 				 				   admin.setPhone("13538039323");
		    		 				 				   admin.setCreateBy("admin11");
		    		 				 				   admin.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.adminService.update(admin);		
		Assert.assertEquals(true, success);
		 Admin admin3=this.adminService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.adminService.delete(id);	
		Assert.assertEquals(true, success);
		Admin admin4=this.adminService.getObjectById(id);
		Assert.assertNull(admin4);
		
		//4.batchInsert
		 List<Admin> list=new ArrayList<Admin>();
	  	  Admin admin5  = new Admin();	   
	   					 
			   					                admin5.setRoleID(1L);
            
			   					                admin5.setSalt("adfasdf");
            
			   					                admin5.setUserName("niutao1");
            
			   					                admin5.setPassWord("niutao111");
            
			   					                admin5.setPhone("13538039322");
            
			   					                admin5.setCreateBy("admin1");
            
			   					                admin5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(admin5);	   
	  	  Admin admin6  = new Admin();	   
	   					 
			   					                admin6.setRoleID(2L);
            
			   					                admin6.setSalt("sdfhgfdh");
            
			   					                admin6.setUserName("niutao2");
            
			   					                admin6.setPassWord("niutao222");
            
			   					                admin6.setPhone("13538039323");
            
			   					                admin6.setCreateBy("admin11");
            
			   					                admin6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(admin6);
	   List<Admin> insertResults= this.adminService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Admin o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Admin> getResults= this.adminService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Admin o :insertResults){
			this.adminService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getAdminSaltById()throws ServiceException, ServiceDaoException{
	 List<Admin> list=new ArrayList<Admin>();
	  	  Admin admin1  = new Admin();	   
	   					 
			   					                admin1.setRoleID(1L);
            
			   					                admin1.setSalt("adfasdf");
            
			   					                admin1.setUserName("niutao1");
            
			   					                admin1.setPassWord("niutao111");
            
			   					                admin1.setPhone("13538039322");
            
			   					                admin1.setCreateBy("admin1");
            
			   					                admin1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(admin1);	
	  	  Admin admin2  = new Admin();	   
	   					 
			   					                admin2.setRoleID(2L);
            
			   					                admin2.setSalt("sdfhgfdh");
            
			   					                admin2.setUserName("niutao2");
            
			   					                admin2.setPassWord("niutao222");
            
			   					                admin2.setPhone("13538039323");
            
			   					                admin2.setCreateBy("admin11");
            
			   					                admin2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(admin2);	  
	  List<Admin> insertResults= this.adminService.insertList(list);
		
	
	   
		
	
		String  lists= adminService.getAdminSaltById(1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(Admin o :insertResults){
			this.adminService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

