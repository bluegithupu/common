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

import com.ptteng.academy.tfboys.model.Video;
import com.ptteng.academy.tfboys.service.VideoService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class VideoServiceTest {

	private static final Log log = LogFactory.getLog(VideoServiceTest.class);
	
	private VideoService videoService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        videoService = (VideoService) context.getBean("videoService");
			//local server
			/**
			videoService = (VideoService)  Naming.lookup("//localhost:8888/VideoRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 videoService = (VideoService) context.getBean("videoService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Video video  = new Video();	   
	   					 
			   					                video.setTitle("title1");
            
			   					                video.setType(1);
            
			   					                video.setGrade(1);
            
			   					                video.setSubject(1);
            
			   					                video.setTeacherID(1);
            
			   					                video.setStatus(1);
            
			   					                video.setUrl("www.baidu.com");
            
			   					                video.setCover("www.baidu.com");
            
			   					                video.setSummary("is a video");
            
			   					                video.setContent("content1");
            
			   					                video.setCollectedNumber(22);
            
			   					                video.setLikedNumber(11);
            
			   					                video.setCreateBy("admin1");
            
			   					                video.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.videoService.insert(video);

      video = this.videoService.getObjectById(id);

	  Video video2=this.videoService.getObjectById(id);
	    Assert.assertNotNull(video2);
	  
		// 2. 更改 
				 		 				 				   video.setTitle("title2");
		    		 				 				   video.setType(2);
		    		 				 				   video.setGrade(5);
		    		 				 				   video.setSubject(2);
		    		 				 				   video.setTeacherID(2);
		    		 				 				   video.setStatus(2);
		    		 				 				   video.setUrl("www.baidu1.com");
		    		 				 				   video.setCover("www.baidu1.com");
		    		 				 				   video.setSummary("is a ha video");
		    		 				 				   video.setContent("content2");
		    		 				 				   video.setCollectedNumber(3);
		    		 				 				   video.setLikedNumber(3);
		    		 				 				   video.setCreateBy("admin11");
		    		 				 				   video.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.videoService.update(video);		
		Assert.assertEquals(true, success);
		 Video video3=this.videoService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.videoService.delete(id);	
		Assert.assertEquals(true, success);
		Video video4=this.videoService.getObjectById(id);
		Assert.assertNull(video4);
		
		//4.batchInsert
		 List<Video> list=new ArrayList<Video>();
	  	  Video video5  = new Video();	   
	   					 
			   					                video5.setTitle("title1");
            
			   					                video5.setType(1);
            
			   					                video5.setGrade(1);
            
			   					                video5.setSubject(1);
            
			   					                video5.setTeacherID(1);
            
			   					                video5.setStatus(1);
            
			   					                video5.setUrl("www.baidu.com");
            
			   					                video5.setCover("www.baidu.com");
            
			   					                video5.setSummary("is a video");
            
			   					                video5.setContent("content1");
            
			   					                video5.setCollectedNumber(22);
            
			   					                video5.setLikedNumber(11);
            
			   					                video5.setCreateBy("admin1");
            
			   					                video5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(video5);	   
	  	  Video video6  = new Video();	   
	   					 
			   					                video6.setTitle("title2");
            
			   					                video6.setType(2);
            
			   					                video6.setGrade(5);
            
			   					                video6.setSubject(2);
            
			   					                video6.setTeacherID(2);
            
			   					                video6.setStatus(2);
            
			   					                video6.setUrl("www.baidu1.com");
            
			   					                video6.setCover("www.baidu1.com");
            
			   					                video6.setSummary("is a ha video");
            
			   					                video6.setContent("content2");
            
			   					                video6.setCollectedNumber(3);
            
			   					                video6.setLikedNumber(3);
            
			   					                video6.setCreateBy("admin11");
            
			   					                video6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(video6);
	   List<Video> insertResults= this.videoService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Video o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Video> getResults= this.videoService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Video o :insertResults){
			this.videoService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

