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

import com.ptteng.academy.tfboys.model.Article;
import com.ptteng.academy.tfboys.service.ArticleService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class ArticleServiceTest {

	private static final Log log = LogFactory.getLog(ArticleServiceTest.class);
	
	private ArticleService articleService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        articleService = (ArticleService) context.getBean("articleService");
			//local server
			/**
			articleService = (ArticleService)  Naming.lookup("//localhost:8888/ArticleRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 articleService = (ArticleService) context.getBean("articleService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Article article  = new Article();	   
	   					 
			   					                article.setTitle("title1");
            
			   					                article.setType(1);
            
			   					                article.setCover("www.baidu.com");
            
			   					                article.setAuthor("nituao1");
            
			   					                article.setSummary("1号简介");
            
			   					                article.setStatus(1);
            
			   					                article.setContent("我是内容1");
            
			   					                article.setCollectedNumber(10);
            
			   					                article.setLikedNumber(50);
            
			   					                article.setCreateBy("admin1");
            
			   					                article.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.articleService.insert(article);

      article = this.articleService.getObjectById(id);

	  Article article2=this.articleService.getObjectById(id);
	    Assert.assertNotNull(article2);
	  
		// 2. 更改 
				 		 				 				   article.setTitle("title2");
		    		 				 				   article.setType(2);
		    		 				 				   article.setCover("www.baidu1.com");
		    		 				 				   article.setAuthor("nituao2");
		    		 				 				   article.setSummary("2号简介");
		    		 				 				   article.setStatus(2);
		    		 				 				   article.setContent("我是内容2");
		    		 				 				   article.setCollectedNumber(15);
		    		 				 				   article.setLikedNumber(100);
		    		 				 				   article.setCreateBy("admin11");
		    		 				 				   article.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.articleService.update(article);		
		Assert.assertEquals(true, success);
		 Article article3=this.articleService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.articleService.delete(id);	
		Assert.assertEquals(true, success);
		Article article4=this.articleService.getObjectById(id);
		Assert.assertNull(article4);
		
		//4.batchInsert
		 List<Article> list=new ArrayList<Article>();
	  	  Article article5  = new Article();	   
	   					 
			   					                article5.setTitle("title1");
            
			   					                article5.setType(1);
            
			   					                article5.setCover("www.baidu.com");
            
			   					                article5.setAuthor("nituao1");
            
			   					                article5.setSummary("1号简介");
            
			   					                article5.setStatus(1);
            
			   					                article5.setContent("我是内容1");
            
			   					                article5.setCollectedNumber(10);
            
			   					                article5.setLikedNumber(50);
            
			   					                article5.setCreateBy("admin1");
            
			   					                article5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(article5);	   
	  	  Article article6  = new Article();	   
	   					 
			   					                article6.setTitle("title2");
            
			   					                article6.setType(2);
            
			   					                article6.setCover("www.baidu1.com");
            
			   					                article6.setAuthor("nituao2");
            
			   					                article6.setSummary("2号简介");
            
			   					                article6.setStatus(2);
            
			   					                article6.setContent("我是内容2");
            
			   					                article6.setCollectedNumber(15);
            
			   					                article6.setLikedNumber(100);
            
			   					                article6.setCreateBy("admin11");
            
			   					                article6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(article6);
	   List<Article> insertResults= this.articleService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Article o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Article> getResults= this.articleService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Article o :insertResults){
			this.articleService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

