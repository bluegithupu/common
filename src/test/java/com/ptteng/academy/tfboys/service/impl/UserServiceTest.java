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

import com.ptteng.academy.tfboys.model.User;
import com.ptteng.academy.tfboys.service.UserService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class UserServiceTest {

	private static final Log log = LogFactory.getLog(UserServiceTest.class);
	
	private UserService userService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        userService = (UserService) context.getBean("userService");
			//local server
			/**
			userService = (UserService)  Naming.lookup("//localhost:8888/UserRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 userService = (UserService) context.getBean("userService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  User user  = new User();	   
	   					 
			   					                user.setOpenID("openidone");
            
			   					                user.setPhone("13538039322");
            
			   					                user.setEmail("304584817@qq.com");
            
			   					                user.setPassWord("niutao1");
            
			   					                user.setNickName("blue1");
            
			   					                user.setGrade(5);
            
			   					                user.setAvatar("www.baidu.com");
            
			   					                user.setAdress("广东省深圳市");
            
			   					                user.setStatus(1);
            
			   					                user.setSex(1);
            
			   					                user.setCreateBy("admin1");
            
			   					                user.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.userService.insert(user);

      user = this.userService.getObjectById(id);

	  User user2=this.userService.getObjectById(id);
	    Assert.assertNotNull(user2);
	  
		// 2. 更改 
				 		 				 				   user.setOpenID("openidtwo");
		    		 				 				   user.setPhone("13538039323");
		    		 				 				   user.setEmail("2689185826@qq.com");
		    		 				 				   user.setPassWord("niutao2");
		    		 				 				   user.setNickName("blue2");
		    		 				 				   user.setGrade(2);
		    		 				 				   user.setAvatar("www.baidu1.com");
		    		 				 				   user.setAdress("甘肃省平凉市");
		    		 				 				   user.setStatus(2);
		    		 				 				   user.setSex(2);
		    		 				 				   user.setCreateBy("admin11");
		    		 				 				   user.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.userService.update(user);		
		Assert.assertEquals(true, success);
		 User user3=this.userService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.userService.delete(id);	
		Assert.assertEquals(true, success);
		User user4=this.userService.getObjectById(id);
		Assert.assertNull(user4);
		
		//4.batchInsert
		 List<User> list=new ArrayList<User>();
	  	  User user5  = new User();	   
	   					 
			   					                user5.setOpenID("openidone");
            
			   					                user5.setPhone("13538039322");
            
			   					                user5.setEmail("304584817@qq.com");
            
			   					                user5.setPassWord("niutao1");
            
			   					                user5.setNickName("blue1");
            
			   					                user5.setGrade(5);
            
			   					                user5.setAvatar("www.baidu.com");
            
			   					                user5.setAdress("广东省深圳市");
            
			   					                user5.setStatus(1);
            
			   					                user5.setSex(1);
            
			   					                user5.setCreateBy("admin1");
            
			   					                user5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(user5);	   
	  	  User user6  = new User();	   
	   					 
			   					                user6.setOpenID("openidtwo");
            
			   					                user6.setPhone("13538039323");
            
			   					                user6.setEmail("2689185826@qq.com");
            
			   					                user6.setPassWord("niutao2");
            
			   					                user6.setNickName("blue2");
            
			   					                user6.setGrade(2);
            
			   					                user6.setAvatar("www.baidu1.com");
            
			   					                user6.setAdress("甘肃省平凉市");
            
			   					                user6.setStatus(2);
            
			   					                user6.setSex(2);
            
			   					                user6.setCreateBy("admin11");
            
			   					                user6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(user6);
	   List<User> insertResults= this.userService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(User o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<User> getResults= this.userService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(User o :insertResults){
			this.userService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getUserIdByOpenID()throws ServiceException, ServiceDaoException{
	 List<User> list=new ArrayList<User>();
	  	  User user1  = new User();	   
	   					 
			   					                user1.setOpenID("openidone");
            
			   					                user1.setPhone("13538039322");
            
			   					                user1.setEmail("304584817@qq.com");
            
			   					                user1.setPassWord("niutao1");
            
			   					                user1.setNickName("blue1");
            
			   					                user1.setGrade(5);
            
			   					                user1.setAvatar("www.baidu.com");
            
			   					                user1.setAdress("广东省深圳市");
            
			   					                user1.setStatus(1);
            
			   					                user1.setSex(1);
            
			   					                user1.setCreateBy("admin1");
            
			   					                user1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(user1);	
	  	  User user2  = new User();	   
	   					 
			   					                user2.setOpenID("openidtwo");
            
			   					                user2.setPhone("13538039323");
            
			   					                user2.setEmail("2689185826@qq.com");
            
			   					                user2.setPassWord("niutao2");
            
			   					                user2.setNickName("blue2");
            
			   					                user2.setGrade(2);
            
			   					                user2.setAvatar("www.baidu1.com");
            
			   					                user2.setAdress("甘肃省平凉市");
            
			   					                user2.setStatus(2);
            
			   					                user2.setSex(2);
            
			   					                user2.setCreateBy("admin11");
            
			   					                user2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(user2);	  
	  List<User> insertResults= this.userService.insertList(list);
		
	
	   
		
	
		Long  lists= userService.getUserIdByOpenID("openidone");
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(User o :insertResults){
			this.userService.delete(o.getId());
}
		 
		};

	
			
		
	//@Test
	public void  getUserIdByEmail()throws ServiceException, ServiceDaoException{
	 List<User> list=new ArrayList<User>();
	  	  User user1  = new User();	   
	   					 
			   					                user1.setOpenID("openidone");
            
			   					                user1.setPhone("13538039322");
            
			   					                user1.setEmail("304584817@qq.com");
            
			   					                user1.setPassWord("niutao1");
            
			   					                user1.setNickName("blue1");
            
			   					                user1.setGrade(5);
            
			   					                user1.setAvatar("www.baidu.com");
            
			   					                user1.setAdress("广东省深圳市");
            
			   					                user1.setStatus(1);
            
			   					                user1.setSex(1);
            
			   					                user1.setCreateBy("admin1");
            
			   					                user1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(user1);	
	  	  User user2  = new User();	   
	   					 
			   					                user2.setOpenID("openidtwo");
            
			   					                user2.setPhone("13538039323");
            
			   					                user2.setEmail("2689185826@qq.com");
            
			   					                user2.setPassWord("niutao2");
            
			   					                user2.setNickName("blue2");
            
			   					                user2.setGrade(2);
            
			   					                user2.setAvatar("www.baidu1.com");
            
			   					                user2.setAdress("甘肃省平凉市");
            
			   					                user2.setStatus(2);
            
			   					                user2.setSex(2);
            
			   					                user2.setCreateBy("admin11");
            
			   					                user2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(user2);	  
	  List<User> insertResults= this.userService.insertList(list);
		
	
	   
		
	
		Long  lists= userService.getUserIdByEmail("304584817@qq.com");
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(User o :insertResults){
			this.userService.delete(o.getId());
}
		 
		};

	
			
		
	//@Test
	public void  getUserIdByPhone()throws ServiceException, ServiceDaoException{
	 List<User> list=new ArrayList<User>();
	  	  User user1  = new User();	   
	   					 
			   					                user1.setOpenID("openidone");
            
			   					                user1.setPhone("13538039322");
            
			   					                user1.setEmail("304584817@qq.com");
            
			   					                user1.setPassWord("niutao1");
            
			   					                user1.setNickName("blue1");
            
			   					                user1.setGrade(5);
            
			   					                user1.setAvatar("www.baidu.com");
            
			   					                user1.setAdress("广东省深圳市");
            
			   					                user1.setStatus(1);
            
			   					                user1.setSex(1);
            
			   					                user1.setCreateBy("admin1");
            
			   					                user1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(user1);	
	  	  User user2  = new User();	   
	   					 
			   					                user2.setOpenID("openidtwo");
            
			   					                user2.setPhone("13538039323");
            
			   					                user2.setEmail("2689185826@qq.com");
            
			   					                user2.setPassWord("niutao2");
            
			   					                user2.setNickName("blue2");
            
			   					                user2.setGrade(2);
            
			   					                user2.setAvatar("www.baidu1.com");
            
			   					                user2.setAdress("甘肃省平凉市");
            
			   					                user2.setStatus(2);
            
			   					                user2.setSex(2);
            
			   					                user2.setCreateBy("admin11");
            
			   					                user2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(user2);	  
	  List<User> insertResults= this.userService.insertList(list);
		
	
	   
		
	
		Long  lists= userService.getUserIdByPhone("13538039322");
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(User o :insertResults){
			this.userService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

