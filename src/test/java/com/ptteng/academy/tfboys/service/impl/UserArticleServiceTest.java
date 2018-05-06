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

import com.ptteng.academy.tfboys.model.UserArticle;
import com.ptteng.academy.tfboys.service.UserArticleService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class UserArticleServiceTest {

	private static final Log log = LogFactory.getLog(UserArticleServiceTest.class);
	
	private UserArticleService userArticleService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        userArticleService = (UserArticleService) context.getBean("userArticleService");
			//local server
			/**
			userArticleService = (UserArticleService)  Naming.lookup("//localhost:8888/UserArticleRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 userArticleService = (UserArticleService) context.getBean("userArticleService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  UserArticle userArticle  = new UserArticle();	   
	   					 
			   					                userArticle.setUserID(1L);
            
			   					                userArticle.setArticleID(4L);
            
			   					                userArticle.setCollectionStatus(1);
            
			   					                userArticle.setLikedStatus(1);
            
			   					                userArticle.setCreateBy("admin1");
            
			   					                userArticle.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.userArticleService.insert(userArticle);

      userArticle = this.userArticleService.getObjectById(id);

	  UserArticle userArticle2=this.userArticleService.getObjectById(id);
	    Assert.assertNotNull(userArticle2);
	  
		// 2. 更改 
				 		 				 				   userArticle.setUserID(2L);
		    		 				 				   userArticle.setArticleID(6L);
		    		 				 				   userArticle.setCollectionStatus(2);
		    		 				 				   userArticle.setLikedStatus(2);
		    		 				 				   userArticle.setCreateBy("admin11");
		    		 				 				   userArticle.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.userArticleService.update(userArticle);		
		Assert.assertEquals(true, success);
		 UserArticle userArticle3=this.userArticleService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.userArticleService.delete(id);	
		Assert.assertEquals(true, success);
		UserArticle userArticle4=this.userArticleService.getObjectById(id);
		Assert.assertNull(userArticle4);
		
		//4.batchInsert
		 List<UserArticle> list=new ArrayList<UserArticle>();
	  	  UserArticle userArticle5  = new UserArticle();	   
	   					 
			   					                userArticle5.setUserID(1L);
            
			   					                userArticle5.setArticleID(4L);
            
			   					                userArticle5.setCollectionStatus(1);
            
			   					                userArticle5.setLikedStatus(1);
            
			   					                userArticle5.setCreateBy("admin1");
            
			   					                userArticle5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(userArticle5);	   
	  	  UserArticle userArticle6  = new UserArticle();	   
	   					 
			   					                userArticle6.setUserID(2L);
            
			   					                userArticle6.setArticleID(6L);
            
			   					                userArticle6.setCollectionStatus(2);
            
			   					                userArticle6.setLikedStatus(2);
            
			   					                userArticle6.setCreateBy("admin11");
            
			   					                userArticle6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(userArticle6);
	   List<UserArticle> insertResults= this.userArticleService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(UserArticle o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<UserArticle> getResults= this.userArticleService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(UserArticle o :insertResults){
			this.userArticleService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getUserArticleIdByArticleIDAndUserID()throws ServiceException, ServiceDaoException{
	 List<UserArticle> list=new ArrayList<UserArticle>();
	  	  UserArticle userArticle1  = new UserArticle();	   
	   					 
			   					                userArticle1.setUserID(1L);
            
			   					                userArticle1.setArticleID(4L);
            
			   					                userArticle1.setCollectionStatus(1);
            
			   					                userArticle1.setLikedStatus(1);
            
			   					                userArticle1.setCreateBy("admin1");
            
			   					                userArticle1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(userArticle1);	
	  	  UserArticle userArticle2  = new UserArticle();	   
	   					 
			   					                userArticle2.setUserID(2L);
            
			   					                userArticle2.setArticleID(6L);
            
			   					                userArticle2.setCollectionStatus(2);
            
			   					                userArticle2.setLikedStatus(2);
            
			   					                userArticle2.setCreateBy("admin11");
            
			   					                userArticle2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userArticle2);	  
	  List<UserArticle> insertResults= this.userArticleService.insertList(list);
		
	
	   
		
	
		Long  lists= userArticleService.getUserArticleIdByArticleIDAndUserID(4L,1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserArticle o :insertResults){
			this.userArticleService.delete(o.getId());
}
		 
		};

	
			
		
	//@Test
	public void  getUserArticleIdsByCollectionStatusAndUserID()throws ServiceException, ServiceDaoException{
	 List<UserArticle> list=new ArrayList<UserArticle>();
	  	  UserArticle userArticle1  = new UserArticle();	   
	   					 
			   					                userArticle1.setUserID(1L);
            
			   					                userArticle1.setArticleID(4L);
            
			   					                userArticle1.setCollectionStatus(1);
            
			   					                userArticle1.setLikedStatus(1);
            
			   					                userArticle1.setCreateBy("admin1");
            
			   					                userArticle1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(userArticle1);	
	  	  UserArticle userArticle2  = new UserArticle();	   
	   					 
			   					                userArticle2.setUserID(2L);
            
			   					                userArticle2.setArticleID(6L);
            
			   					                userArticle2.setCollectionStatus(2);
            
			   					                userArticle2.setLikedStatus(2);
            
			   					                userArticle2.setCreateBy("admin11");
            
			   					                userArticle2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userArticle2);	  
	  List<UserArticle> insertResults= this.userArticleService.insertList(list);
		
	
	   
		
	
		List<Long>  lists= userArticleService.getUserArticleIdsByCollectionStatusAndUserID(1,1L,0,Integer.MAX_VALUE);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserArticle o :insertResults){
			this.userArticleService.delete(o.getId());
}
		 
		};

	
			
		
	//@Test
	public void  getUserArticleIdsByLikedStatusAndUserID()throws ServiceException, ServiceDaoException{
	 List<UserArticle> list=new ArrayList<UserArticle>();
	  	  UserArticle userArticle1  = new UserArticle();	   
	   					 
			   					                userArticle1.setUserID(1L);
            
			   					                userArticle1.setArticleID(4L);
            
			   					                userArticle1.setCollectionStatus(1);
            
			   					                userArticle1.setLikedStatus(1);
            
			   					                userArticle1.setCreateBy("admin1");
            
			   					                userArticle1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(userArticle1);	
	  	  UserArticle userArticle2  = new UserArticle();	   
	   					 
			   					                userArticle2.setUserID(2L);
            
			   					                userArticle2.setArticleID(6L);
            
			   					                userArticle2.setCollectionStatus(2);
            
			   					                userArticle2.setLikedStatus(2);
            
			   					                userArticle2.setCreateBy("admin11");
            
			   					                userArticle2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userArticle2);	  
	  List<UserArticle> insertResults= this.userArticleService.insertList(list);
		
	
	   
		
	
		List<Long>  lists= userArticleService.getUserArticleIdsByLikedStatusAndUserID(1,1L,0,Integer.MAX_VALUE);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserArticle o :insertResults){
			this.userArticleService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

