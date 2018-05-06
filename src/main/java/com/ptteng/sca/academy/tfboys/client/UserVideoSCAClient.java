/**
 * 
 */
package com.ptteng.sca.academy.tfboys.client;

import java.util.List;
import java.util.Map;

import com.ptteng.academy.tfboys.model.UserVideo;
import com.ptteng.academy.tfboys.service.UserVideoService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class UserVideoSCAClient implements UserVideoService {

    private UserVideoService userVideoService;

	public UserVideoService getUserVideoService() {
		return userVideoService;
	}
	
	
	public void setUserVideoService(UserVideoService userVideoService) {
		this.userVideoService =userVideoService;
	}
	
	
			   
		@Override
		public Long insert(UserVideo userVideo)throws ServiceException, ServiceDaoException{
		
		return userVideoService.insert(userVideo);
		          
		
		}	
		  
    	   
		@Override
		public List<UserVideo> insertList(List<UserVideo> userVideoList)throws ServiceException, ServiceDaoException{
		
		return userVideoService.insertList(userVideoList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return userVideoService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(UserVideo userVideo)throws ServiceException, ServiceDaoException{
		
		return userVideoService.update(userVideo);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<UserVideo> userVideoList)throws ServiceException, ServiceDaoException{
		
		return userVideoService.updateList(userVideoList);
		          
		
		}	
		  
    	   
		@Override
		public UserVideo getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return userVideoService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<UserVideo> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return userVideoService.getObjectsByIds(ids);
		          
		
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
		
		return userVideoService.getUserVideoIdByVideoIDAndUserID(videoID,userID);
	
	
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
		
		return userVideoService.getUserVideoIdsByLikedStatusAndUserID(likedStatus,userID,start,limit);
	
	
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
		
		return userVideoService.getUserVideoIdsByCollectionStatusAndUserID(collectionStatus,userID,start,limit);
	
	
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
		
		return userVideoService.countUserVideoIdsByLikedStatusAndUserID(likedStatus,userID);
	
	
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
		
		return userVideoService.countUserVideoIdsByCollectionStatusAndUserID(collectionStatus,userID);
	
	
	}
	
		
	
		@Override
	public List<Long> getUserVideoIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userVideoService.getUserVideoIds(start, limit);
	}

	@Override
	public Integer countUserVideoIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userVideoService.countUserVideoIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userVideoService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userVideoService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   userVideoService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.userVideoService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

