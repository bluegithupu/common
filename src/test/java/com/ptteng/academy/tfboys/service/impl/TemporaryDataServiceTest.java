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

import com.ptteng.academy.tfboys.model.TemporaryData;
import com.ptteng.academy.tfboys.service.TemporaryDataService;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
@Ignore
public class TemporaryDataServiceTest {

	private static final Log log = LogFactory.getLog(TemporaryDataServiceTest.class);
	
	private TemporaryDataService temporaryDataService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/academy-tfboys-service/applicationContext-server.xml");
	        temporaryDataService = (TemporaryDataService) context.getBean("temporaryDataService");
			//local server
			/**
			temporaryDataService = (TemporaryDataService)  Naming.lookup("//localhost:8888/TemporaryDataRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 temporaryDataService = (TemporaryDataService) context.getBean("temporaryDataService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  TemporaryData temporaryData  = new TemporaryData();	   
	   					 
			   					                temporaryData.setOpenID("dsgsagdsfgsdassd");
            
			   					                temporaryData.setAccessToken("eewaffshfghhjf");
            
			   					                temporaryData.setEmailCode(15482);
            
			   					                temporaryData.setPhoneCode(52874);
            
			   					                temporaryData.setEmailCodeTimes(1);
            
			   					                temporaryData.setPhoneCodeTimes(1);
            
			   					                temporaryData.setCreateBy("admin1");
            
			   					                temporaryData.setUpdateBy("admin2");
            
			   					 
			   					 
			   	 
	 
	  Long id= this.temporaryDataService.insert(temporaryData);

      temporaryData = this.temporaryDataService.getObjectById(id);

	  TemporaryData temporaryData2=this.temporaryDataService.getObjectById(id);
	    Assert.assertNotNull(temporaryData2);
	  
		// 2. 更改 
				 		 				 				   temporaryData.setOpenID("ghjgftdsrtyyuouopnj");
		    		 				 				   temporaryData.setAccessToken("gddfrtsfsbfbhsdf");
		    		 				 				   temporaryData.setEmailCode(74158);
		    		 				 				   temporaryData.setPhoneCode(28545);
		    		 				 				   temporaryData.setEmailCodeTimes(3);
		    		 				 				   temporaryData.setPhoneCodeTimes(3);
		    		 				 				   temporaryData.setCreateBy("admin11");
		    		 				 				   temporaryData.setUpdateBy("admin22");
		    		 				 		 				 		 				boolean success=this.temporaryDataService.update(temporaryData);		
		Assert.assertEquals(true, success);
		 TemporaryData temporaryData3=this.temporaryDataService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.temporaryDataService.delete(id);	
		Assert.assertEquals(true, success);
		TemporaryData temporaryData4=this.temporaryDataService.getObjectById(id);
		Assert.assertNull(temporaryData4);
		
		//4.batchInsert
		 List<TemporaryData> list=new ArrayList<TemporaryData>();
	  	  TemporaryData temporaryData5  = new TemporaryData();	   
	   					 
			   					                temporaryData5.setOpenID("dsgsagdsfgsdassd");
            
			   					                temporaryData5.setAccessToken("eewaffshfghhjf");
            
			   					                temporaryData5.setEmailCode(15482);
            
			   					                temporaryData5.setPhoneCode(52874);
            
			   					                temporaryData5.setEmailCodeTimes(1);
            
			   					                temporaryData5.setPhoneCodeTimes(1);
            
			   					                temporaryData5.setCreateBy("admin1");
            
			   					                temporaryData5.setUpdateBy("admin2");
            
			   					 
			   					 
			   	    list.add(temporaryData5);	   
	  	  TemporaryData temporaryData6  = new TemporaryData();	   
	   					 
			   					                temporaryData6.setOpenID("ghjgftdsrtyyuouopnj");
            
			   					                temporaryData6.setAccessToken("gddfrtsfsbfbhsdf");
            
			   					                temporaryData6.setEmailCode(74158);
            
			   					                temporaryData6.setPhoneCode(28545);
            
			   					                temporaryData6.setEmailCodeTimes(3);
            
			   					                temporaryData6.setPhoneCodeTimes(3);
            
			   					                temporaryData6.setCreateBy("admin11");
            
			   					                temporaryData6.setUpdateBy("admin22");
            
			   					 
			   					 
			   	   list.add(temporaryData6);
	   List<TemporaryData> insertResults= this.temporaryDataService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(TemporaryData o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<TemporaryData> getResults= this.temporaryDataService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(TemporaryData o :insertResults){
			this.temporaryDataService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
			
		
	//@Test
	public void  getTemporaryDataIdByOpenID()throws ServiceException, ServiceDaoException{
	 List<TemporaryData> list=new ArrayList<TemporaryData>();
	  	  TemporaryData temporaryData1  = new TemporaryData();	   
	   					 
			   					                temporaryData1.setOpenID("dsgsagdsfgsdassd");
            
			   					                temporaryData1.setAccessToken("eewaffshfghhjf");
            
			   					                temporaryData1.setEmailCode(15482);
            
			   					                temporaryData1.setPhoneCode(52874);
            
			   					                temporaryData1.setEmailCodeTimes(1);
            
			   					                temporaryData1.setPhoneCodeTimes(1);
            
			   					                temporaryData1.setCreateBy("admin1");
            
			   					                temporaryData1.setUpdateBy("admin2");
            
			   					 
			   					 
			   	  list.add(temporaryData1);	
	  	  TemporaryData temporaryData2  = new TemporaryData();	   
	   					 
			   					                temporaryData2.setOpenID("ghjgftdsrtyyuouopnj");
            
			   					                temporaryData2.setAccessToken("gddfrtsfsbfbhsdf");
            
			   					                temporaryData2.setEmailCode(74158);
            
			   					                temporaryData2.setPhoneCode(28545);
            
			   					                temporaryData2.setEmailCodeTimes(3);
            
			   					                temporaryData2.setPhoneCodeTimes(3);
            
			   					                temporaryData2.setCreateBy("admin11");
            
			   					                temporaryData2.setUpdateBy("admin22");
            
			   					 
			   					 
			   	  list.add(temporaryData2);	  
	  List<TemporaryData> insertResults= this.temporaryDataService.insertList(list);
		
	
	   
		
	
		Long  lists= temporaryDataService.getTemporaryDataIdByOpenID("dsgsagdsfgsdassd");
		//TODO 增加自己的验证逻辑
		Assert.assertNotNull(lists);		
		
		 for(TemporaryData o :insertResults){
			this.temporaryDataService.delete(o.getId());
}
		 
		};

	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

