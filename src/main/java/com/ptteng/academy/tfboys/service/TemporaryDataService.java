package com.ptteng.academy.tfboys.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.TemporaryData;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface TemporaryDataService extends BaseDaoService {

	



   		   
		
		public Long insert(TemporaryData temporaryData)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<TemporaryData> insertList(List<TemporaryData> temporaryDataList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(TemporaryData temporaryData)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<TemporaryData> temporaryDataList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public TemporaryData getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<TemporaryData> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


					
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Long  getTemporaryDataIdByOpenID(String openID)throws ServiceException, ServiceDaoException;
		
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getTemporaryDataIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countTemporaryDataIds() throws ServiceException, ServiceDaoException;
	

}

