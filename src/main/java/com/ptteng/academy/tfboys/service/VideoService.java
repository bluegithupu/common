package com.ptteng.academy.tfboys.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.Video;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface VideoService extends BaseDaoService {

	



   		   
		
		public Long insert(Video video)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Video> insertList(List<Video> videoList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Video video)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Video> videoList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Video getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Video> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getVideoIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countVideoIds() throws ServiceException, ServiceDaoException;
	

}

