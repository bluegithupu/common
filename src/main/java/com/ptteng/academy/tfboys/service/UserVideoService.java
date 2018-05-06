package com.ptteng.academy.tfboys.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.UserVideo;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface UserVideoService extends BaseDaoService {

	



   		   
		
		public Long insert(UserVideo userVideo)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<UserVideo> insertList(List<UserVideo> userVideoList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(UserVideo userVideo)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<UserVideo> userVideoList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public UserVideo getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<UserVideo> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer  countUserVideoIdsByLikedStatusAndUserID(Integer likedStatus,Long userID)throws ServiceException, ServiceDaoException;
			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer  countUserVideoIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID)throws ServiceException, ServiceDaoException;
					
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Long  getUserVideoIdByVideoIDAndUserID(Long videoID,Long userID)throws ServiceException, ServiceDaoException;
			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long>  getUserVideoIdsByLikedStatusAndUserID(Integer likedStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException;
			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long>  getUserVideoIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException;
		
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getUserVideoIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countUserVideoIds() throws ServiceException, ServiceDaoException;
	

}

