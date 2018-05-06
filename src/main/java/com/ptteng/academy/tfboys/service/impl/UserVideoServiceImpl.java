package com.ptteng.academy.tfboys.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.academy.tfboys.model.UserVideo;
import com.ptteng.academy.tfboys.service.UserVideoService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class UserVideoServiceImpl extends BaseDaoServiceImpl implements UserVideoService {

 

	private static final Log log = LogFactory.getLog(UserVideoServiceImpl.class);



		   
		@Override
		public Long insert(UserVideo userVideo)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + userVideo);

		if (userVideo == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		userVideo.setCreateAt(currentTimeMillis);
		userVideo.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(userVideo);
		} catch (DaoException e) {
			log.error(" insert wrong : " + userVideo);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<UserVideo> insertList(List<UserVideo> userVideoList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (userVideoList == null ? "null" : userVideoList.size()));
      
		List<UserVideo> resultList = null;

		if (CollectionUtils.isEmpty(userVideoList)) {
			return new ArrayList<UserVideo>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (UserVideo userVideo : userVideoList) {
			userVideo.setCreateAt(currentTimeMillis);
			userVideo.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<UserVideo>) dao.batchSave(userVideoList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + userVideoList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert lists  success : " + (resultList == null ? "null" : resultList.size()));
    
		return resultList;
		
		
			
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
	
		            
	    log.info(" delete data : " + id);
 
		boolean result = false;

		if (id == null) {
			return true;
		}

		try {
			result = dao.delete(UserVideo.class, id);
		} catch (DaoException e) {
			log.error(" delete wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
 
		log.info(" delete data success : " + id);
   
		return result;
		
		}	
		  
    	   
		@Override
		public boolean update(UserVideo userVideo)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (userVideo == null ? "null" : userVideo.getId()));

		boolean result = false;

		if (userVideo == null) {
			return true;
		}

		userVideo.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(userVideo);
		} catch (DaoException e) {
			log.error(" update wrong : " + userVideo);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + userVideo);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<UserVideo> userVideoList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (userVideoList == null ? "null" : userVideoList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(userVideoList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (UserVideo userVideo : userVideoList) {
			userVideo.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(userVideoList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + userVideoList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + userVideoList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public UserVideo getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		UserVideo userVideo = null;

		if (id == null) {
			return userVideo;
		}

		try {
			userVideo = (UserVideo) dao.get(UserVideo.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return userVideo;		
		}	
		  
    	   
		@Override
		public List<UserVideo> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<UserVideo> userVideo = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<UserVideo>();
		}

		try {
			userVideo = (List<UserVideo>) dao.getList(UserVideo.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (userVideo == null ? "null" : userVideo.size()));
    
		return userVideo;	
		}	
		  
    	
		
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getUserVideoIdByVideoIDAndUserID(Long videoID,Long userID)throws ServiceException, ServiceDaoException{
		
		      if(log.isInfoEnabled()){
	  log.info(" get id by videoID,userID  : " + videoID+" , "+userID );
	  }
	  Long id = null;
	
      // TODO 参数检查!
      
	try {
		
	
	
        id = (Long) dao.getMapping("getUserVideoIdByVideoIDAndUserID", new Object[] {videoID,userID });
   } catch (DaoException e) {
			log.error(" get id wrong by videoID,userID  : " + videoID+" , "+userID );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
   log.info(" get id success : " + id);
   }
		return id;
        
	
	
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public List<Long>  getUserVideoIdsByLikedStatusAndUserID(Integer likedStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException{
		
		       if(log.isInfoEnabled()){
      log.info(" get ids by likedStatus,userID,start,limit  : " + likedStatus+" , "+userID+" , "+start+" , "+limit );
	  }
	 	List<Long> idList = null;
        
        // TODO 参数检查!

        if (start == null) {
            start = 0;
        }

        if (limit == null) {
            limit = Integer.MAX_VALUE;
        }

	try {
		idList = dao.getIdList("getUserVideoIdsByLikedStatusAndUserID", new Object[] { likedStatus,userID},start,limit, false);

   
   } catch (DaoException e) {
			log.error(" get ids  wrong by likedStatus,userID,start,limit)  : " + likedStatus+" , "+userID+" , "+start+" , "+limit );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
   log.info(" get ids success : " + (idList == null ? "null" : idList.size()));
  }
		return idList;
		
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public List<Long>  getUserVideoIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException{
		
		       if(log.isInfoEnabled()){
      log.info(" get ids by collectionStatus,userID,start,limit  : " + collectionStatus+" , "+userID+" , "+start+" , "+limit );
	  }
	 	List<Long> idList = null;
        
        // TODO 参数检查!

        if (start == null) {
            start = 0;
        }

        if (limit == null) {
            limit = Integer.MAX_VALUE;
        }

	try {
		idList = dao.getIdList("getUserVideoIdsByCollectionStatusAndUserID", new Object[] { collectionStatus,userID},start,limit, false);

   
   } catch (DaoException e) {
			log.error(" get ids  wrong by collectionStatus,userID,start,limit)  : " + collectionStatus+" , "+userID+" , "+start+" , "+limit );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
   log.info(" get ids success : " + (idList == null ? "null" : idList.size()));
  }
		return idList;
		
	
	
	}
	
		
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Integer  countUserVideoIdsByLikedStatusAndUserID(Integer likedStatus,Long userID)throws ServiceException, ServiceDaoException{
		
		       if(log.isInfoEnabled()){
      log.info(" count ids by likedStatus,userID  : " + likedStatus+" , "+userID );
	  }
	 	Integer count=null;
        
       

	try {
	   
		count = dao.count("getUserVideoIdsByLikedStatusAndUserID", new Object[] { likedStatus,userID});

   
   } catch (DaoException e) {
			log.error(" count ids  wrong by likedStatus,userID)  : " + likedStatus+" , "+userID );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
    log.info(" count  success : " + count);
  }
		return count;
		
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Integer  countUserVideoIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID)throws ServiceException, ServiceDaoException{
		
		       if(log.isInfoEnabled()){
      log.info(" count ids by collectionStatus,userID  : " + collectionStatus+" , "+userID );
	  }
	 	Integer count=null;
        
       

	try {
	   
		count = dao.count("getUserVideoIdsByCollectionStatusAndUserID", new Object[] { collectionStatus,userID});

   
   } catch (DaoException e) {
			log.error(" count ids  wrong by collectionStatus,userID)  : " + collectionStatus+" , "+userID );
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
  if(log.isInfoEnabled()){
    log.info(" count  success : " + count);
  }
		return count;
		
	
	
	}
	
		
	
	
	
		
	@Override
	public List<Long> getUserVideoIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		
		log.info(" get ids   by start,limit  ================== " + start + " , " + limit);
		List<Long> idList = null;
		
		
		
		if (start == null) {
			start = 0;
		}

		if (limit == null) {
			limit = Integer.MAX_VALUE;
		}
		
		try {
			idList = dao.getIdList("getUserVideoIdsAll",new Object[] {},start, limit, false);
		} catch (DaoException e) {
			log.error(" get ids  wrong by start,limit)  : " + start + " , " + limit);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" get ids success == : " + (idList == null ? "null" : idList.size()));
		}
		return idList;
	}
	
	
		@Override
	public Integer countUserVideoIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getUserVideoIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getUserVideoIds " ) ;
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" count  : " + count);
		}
		return count;
	}

}

