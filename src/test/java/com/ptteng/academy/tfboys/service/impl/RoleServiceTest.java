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

import com.ptteng.academy.tfboys.model.Role;
import com.ptteng.academy.tfboys.service.RoleService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class RoleServiceTest {

	private static final Log log = LogFactory.getLog(RoleServiceTest.class);
	
	private RoleService roleService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        roleService = (RoleService) context.getBean("roleService");
			//local server
			/**
			roleService = (RoleService)  Naming.lookup("//localhost:8888/RoleRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 roleService = (RoleService) context.getBean("roleService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Role role  = new Role();	   
	   					 
			   					                role.setRoleName("普通管理");
            
			   					                role.setCreateBy("admin1");
            
			   					                role.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.roleService.insert(role);

      role = this.roleService.getObjectById(id);

	  Role role2=this.roleService.getObjectById(id);
	    Assert.assertNotNull(role2);
	  
		// 2. 更改 
				 		 				 				   role.setRoleName("超级管理");
		    		 				 				   role.setCreateBy("admin11");
		    		 				 				   role.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.roleService.update(role);		
		Assert.assertEquals(true, success);
		 Role role3=this.roleService.getObjectById(id);
				 		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.roleService.delete(id);	
		Assert.assertEquals(true, success);
		Role role4=this.roleService.getObjectById(id);
		Assert.assertNull(role4);
		
		//4.batchInsert
		 List<Role> list=new ArrayList<Role>();
	  	  Role role5  = new Role();	   
	   					 
			   					                role5.setRoleName("普通管理");
            
			   					                role5.setCreateBy("admin1");
            
			   					                role5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(role5);	   
	  	  Role role6  = new Role();	   
	   					 
			   					                role6.setRoleName("超级管理");
            
			   					                role6.setCreateBy("admin11");
            
			   					                role6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(role6);
	   List<Role> insertResults= this.roleService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Role o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Role> getResults= this.roleService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Role o :insertResults){
			this.roleService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getRoleRoleNameById()throws ServiceException, ServiceDaoException{
	 List<Role> list=new ArrayList<Role>();
	  	  Role role1  = new Role();	   
	   					 
			   					                role1.setRoleName("普通管理");
            
			   					                role1.setCreateBy("admin1");
            
			   					                role1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(role1);	
	  	  Role role2  = new Role();	   
	   					 
			   					                role2.setRoleName("超级管理");
            
			   					                role2.setCreateBy("admin11");
            
			   					                role2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(role2);	  
	  List<Role> insertResults= this.roleService.insertList(list);
		
	
	   
		
	
		String  lists= roleService.getRoleRoleNameById(1L);
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(Role o :insertResults){
			this.roleService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

