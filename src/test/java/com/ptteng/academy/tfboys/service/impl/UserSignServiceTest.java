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

import com.ptteng.academy.tfboys.model.UserSign;
import com.ptteng.academy.tfboys.service.UserSignService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class UserSignServiceTest {

	private static final Log log = LogFactory.getLog(UserSignServiceTest.class);
	
	private UserSignService userSignService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        userSignService = (UserSignService) context.getBean("userSignService");
			//local server
			/**
			userSignService = (UserSignService)  Naming.lookup("//localhost:8888/UserSignRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 userSignService = (UserSignService) context.getBean("userSignService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  UserSign userSign  = new UserSign();	   
	   					 
			   					                userSign.setUserID(1L);
            
			   					                userSign.setTotalSign(22);
            
			   					                userSign.setMaxSign(6);
            
			   					                userSign.setContinuousNumber(4);
            
			   					                userSign.setRecordSign("101000011");
            
			   					                userSign.setBean(20);
            
			   					                userSign.setCreateBy("admin1");
            
			   					                userSign.setUpdateBy("admin22");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.userSignService.insert(userSign);

      userSign = this.userSignService.getObjectById(id);

	  UserSign userSign2=this.userSignService.getObjectById(id);
	    Assert.assertNotNull(userSign2);
	  
		// 2. 更改 
				 		 				 				   userSign.setUserID(2L);
		    		 				 				   userSign.setTotalSign(33);
		    		 				 				   userSign.setMaxSign(5);
		    		 				 				   userSign.setContinuousNumber(5);
		    		 				 				   userSign.setRecordSign("1110");
		    		 				 				   userSign.setBean(200);
		    		 				 				   userSign.setCreateBy("admin11");
		    		 				 				   userSign.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.userSignService.update(userSign);		
		Assert.assertEquals(true, success);
		 UserSign userSign3=this.userSignService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.userSignService.delete(id);	
		Assert.assertEquals(true, success);
		UserSign userSign4=this.userSignService.getObjectById(id);
		Assert.assertNull(userSign4);
		
		//4.batchInsert
		 List<UserSign> list=new ArrayList<UserSign>();
	  	  UserSign userSign5  = new UserSign();	   
	   					 
			   					                userSign5.setUserID(1L);
            
			   					                userSign5.setTotalSign(22);
            
			   					                userSign5.setMaxSign(6);
            
			   					                userSign5.setContinuousNumber(4);
            
			   					                userSign5.setRecordSign("101000011");
            
			   					                userSign5.setBean(20);
            
			   					                userSign5.setCreateBy("admin1");
            
			   					                userSign5.setUpdateBy("admin22");
            
			   					 
			   					 
			   	    list.add(userSign5);	   
	  	  UserSign userSign6  = new UserSign();	   
	   					 
			   					                userSign6.setUserID(2L);
            
			   					                userSign6.setTotalSign(33);
            
			   					                userSign6.setMaxSign(5);
            
			   					                userSign6.setContinuousNumber(5);
            
			   					                userSign6.setRecordSign("1110");
            
			   					                userSign6.setBean(200);
            
			   					                userSign6.setCreateBy("admin11");
            
			   					                userSign6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(userSign6);
	   List<UserSign> insertResults= this.userSignService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(UserSign o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<UserSign> getResults= this.userSignService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(UserSign o :insertResults){
			this.userSignService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getUserSignIdByUserID()throws ServiceException, ServiceDaoException{
	 List<UserSign> list=new ArrayList<UserSign>();
	  	  UserSign userSign1  = new UserSign();	   
	   					 
			   					                userSign1.setUserID(1L);
            
			   					                userSign1.setTotalSign(22);
            
			   					                userSign1.setMaxSign(6);
            
			   					                userSign1.setContinuousNumber(4);
            
			   					                userSign1.setRecordSign("101000011");
            
			   					                userSign1.setBean(20);
            
			   					                userSign1.setCreateBy("admin1");
            
			   					                userSign1.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userSign1);	
	  	  UserSign userSign2  = new UserSign();	   
	   					 
			   					                userSign2.setUserID(2L);
            
			   					                userSign2.setTotalSign(33);
            
			   					                userSign2.setMaxSign(5);
            
			   					                userSign2.setContinuousNumber(5);
            
			   					                userSign2.setRecordSign("1110");
            
			   					                userSign2.setBean(200);
            
			   					                userSign2.setCreateBy("admin11");
            
			   					                userSign2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userSign2);	  
	  List<UserSign> insertResults= this.userSignService.insertList(list);
		
	
	   
		
	
		Long  lists= userSignService.getUserSignIdByUserID(1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserSign o :insertResults){
			this.userSignService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

