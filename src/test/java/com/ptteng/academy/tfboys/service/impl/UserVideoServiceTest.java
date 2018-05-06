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

import com.ptteng.academy.tfboys.model.UserVideo;
import com.ptteng.academy.tfboys.service.UserVideoService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class UserVideoServiceTest {

	private static final Log log = LogFactory.getLog(UserVideoServiceTest.class);
	
	private UserVideoService userVideoService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        userVideoService = (UserVideoService) context.getBean("userVideoService");
			//local server
			/**
			userVideoService = (UserVideoService)  Naming.lookup("//localhost:8888/UserVideoRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 userVideoService = (UserVideoService) context.getBean("userVideoService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  UserVideo userVideo  = new UserVideo();	   
	   					 
			   					                userVideo.setUserID(1L);
            
			   					                userVideo.setVideoID(4L);
            
			   					                userVideo.setCollectionStatus(1);
            
			   					                userVideo.setLikedStatus(1);
            
			   					                userVideo.setCreateBy("admin1");
            
			   					                userVideo.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.userVideoService.insert(userVideo);

      userVideo = this.userVideoService.getObjectById(id);

	  UserVideo userVideo2=this.userVideoService.getObjectById(id);
	    Assert.assertNotNull(userVideo2);
	  
		// 2. 更改 
				 		 				 				   userVideo.setUserID(2L);
		    		 				 				   userVideo.setVideoID(6L);
		    		 				 				   userVideo.setCollectionStatus(2);
		    		 				 				   userVideo.setLikedStatus(2);
		    		 				 				   userVideo.setCreateBy("admin11");
		    		 				 				   userVideo.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.userVideoService.update(userVideo);		
		Assert.assertEquals(true, success);
		 UserVideo userVideo3=this.userVideoService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.userVideoService.delete(id);	
		Assert.assertEquals(true, success);
		UserVideo userVideo4=this.userVideoService.getObjectById(id);
		Assert.assertNull(userVideo4);
		
		//4.batchInsert
		 List<UserVideo> list=new ArrayList<UserVideo>();
	  	  UserVideo userVideo5  = new UserVideo();	   
	   					 
			   					                userVideo5.setUserID(1L);
            
			   					                userVideo5.setVideoID(4L);
            
			   					                userVideo5.setCollectionStatus(1);
            
			   					                userVideo5.setLikedStatus(1);
            
			   					                userVideo5.setCreateBy("admin1");
            
			   					                userVideo5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(userVideo5);	   
	  	  UserVideo userVideo6  = new UserVideo();	   
	   					 
			   					                userVideo6.setUserID(2L);
            
			   					                userVideo6.setVideoID(6L);
            
			   					                userVideo6.setCollectionStatus(2);
            
			   					                userVideo6.setLikedStatus(2);
            
			   					                userVideo6.setCreateBy("admin11");
            
			   					                userVideo6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(userVideo6);
	   List<UserVideo> insertResults= this.userVideoService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(UserVideo o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<UserVideo> getResults= this.userVideoService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(UserVideo o :insertResults){
			this.userVideoService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getUserVideoIdByVideoIDAndUserID()throws ServiceException, ServiceDaoException{
	 List<UserVideo> list=new ArrayList<UserVideo>();
	  	  UserVideo userVideo1  = new UserVideo();	   
	   					 
			   					                userVideo1.setUserID(1L);
            
			   					                userVideo1.setVideoID(4L);
            
			   					                userVideo1.setCollectionStatus(1);
            
			   					                userVideo1.setLikedStatus(1);
            
			   					                userVideo1.setCreateBy("admin1");
            
			   					                userVideo1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(userVideo1);	
	  	  UserVideo userVideo2  = new UserVideo();	   
	   					 
			   					                userVideo2.setUserID(2L);
            
			   					                userVideo2.setVideoID(6L);
            
			   					                userVideo2.setCollectionStatus(2);
            
			   					                userVideo2.setLikedStatus(2);
            
			   					                userVideo2.setCreateBy("admin11");
            
			   					                userVideo2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userVideo2);	  
	  List<UserVideo> insertResults= this.userVideoService.insertList(list);
		
	
	   
		
	
		Long  lists= userVideoService.getUserVideoIdByVideoIDAndUserID(4L,1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserVideo o :insertResults){
			this.userVideoService.delete(o.getId());
}
		 
		};

	
			
		
	//@Test
	public void  getUserVideoIdsByLikedStatusAndUserID()throws ServiceException, ServiceDaoException{
	 List<UserVideo> list=new ArrayList<UserVideo>();
	  	  UserVideo userVideo1  = new UserVideo();	   
	   					 
			   					                userVideo1.setUserID(1L);
            
			   					                userVideo1.setVideoID(4L);
            
			   					                userVideo1.setCollectionStatus(1);
            
			   					                userVideo1.setLikedStatus(1);
            
			   					                userVideo1.setCreateBy("admin1");
            
			   					                userVideo1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(userVideo1);	
	  	  UserVideo userVideo2  = new UserVideo();	   
	   					 
			   					                userVideo2.setUserID(2L);
            
			   					                userVideo2.setVideoID(6L);
            
			   					                userVideo2.setCollectionStatus(2);
            
			   					                userVideo2.setLikedStatus(2);
            
			   					                userVideo2.setCreateBy("admin11");
            
			   					                userVideo2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userVideo2);	  
	  List<UserVideo> insertResults= this.userVideoService.insertList(list);
		
	
	   
		
	
		List<Long>  lists= userVideoService.getUserVideoIdsByLikedStatusAndUserID(1,1L,0,Integer.MAX_VALUE);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserVideo o :insertResults){
			this.userVideoService.delete(o.getId());
}
		 
		};

	
			
		
	//@Test
	public void  getUserVideoIdsByCollectionStatusAndUserID()throws ServiceException, ServiceDaoException{
	 List<UserVideo> list=new ArrayList<UserVideo>();
	  	  UserVideo userVideo1  = new UserVideo();	   
	   					 
			   					                userVideo1.setUserID(1L);
            
			   					                userVideo1.setVideoID(4L);
            
			   					                userVideo1.setCollectionStatus(1);
            
			   					                userVideo1.setLikedStatus(1);
            
			   					                userVideo1.setCreateBy("admin1");
            
			   					                userVideo1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(userVideo1);	
	  	  UserVideo userVideo2  = new UserVideo();	   
	   					 
			   					                userVideo2.setUserID(2L);
            
			   					                userVideo2.setVideoID(6L);
            
			   					                userVideo2.setCollectionStatus(2);
            
			   					                userVideo2.setLikedStatus(2);
            
			   					                userVideo2.setCreateBy("admin11");
            
			   					                userVideo2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(userVideo2);	  
	  List<UserVideo> insertResults= this.userVideoService.insertList(list);
		
	
	   
		
	
		List<Long>  lists= userVideoService.getUserVideoIdsByCollectionStatusAndUserID(1,1L,0,Integer.MAX_VALUE);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(UserVideo o :insertResults){
			this.userVideoService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

