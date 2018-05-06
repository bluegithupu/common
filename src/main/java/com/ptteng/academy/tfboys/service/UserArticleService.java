package com.ptteng.academy.tfboys.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.UserArticle;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface UserArticleService extends BaseDaoService {

	



   		   
		
		public Long insert(UserArticle userArticle)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<UserArticle> insertList(List<UserArticle> userArticleList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(UserArticle userArticle)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<UserArticle> userArticleList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public UserArticle getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<UserArticle> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer  countUserArticleIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID)throws ServiceException, ServiceDaoException;
			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer  countUserArticleIdsByLikedStatusAndUserID(Integer likedStatus,Long userID)throws ServiceException, ServiceDaoException;
					
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Long  getUserArticleIdByArticleIDAndUserID(Long articleID,Long userID)throws ServiceException, ServiceDaoException;
			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long>  getUserArticleIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException;
			
			
	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long>  getUserArticleIdsByLikedStatusAndUserID(Integer likedStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException;
		
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getUserArticleIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countUserArticleIds() throws ServiceException, ServiceDaoException;
	

}

