/**
 * 
 */
package com.ptteng.sca.academy.tfboys.client;

import java.util.List;
import java.util.Map;

import com.ptteng.academy.tfboys.model.UserArticle;
import com.ptteng.academy.tfboys.service.UserArticleService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class UserArticleSCAClient implements UserArticleService {

    private UserArticleService userArticleService;

	public UserArticleService getUserArticleService() {
		return userArticleService;
	}
	
	
	public void setUserArticleService(UserArticleService userArticleService) {
		this.userArticleService =userArticleService;
	}
	
	
			   
		@Override
		public Long insert(UserArticle userArticle)throws ServiceException, ServiceDaoException{
		
		return userArticleService.insert(userArticle);
		          
		
		}	
		  
    	   
		@Override
		public List<UserArticle> insertList(List<UserArticle> userArticleList)throws ServiceException, ServiceDaoException{
		
		return userArticleService.insertList(userArticleList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return userArticleService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(UserArticle userArticle)throws ServiceException, ServiceDaoException{
		
		return userArticleService.update(userArticle);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<UserArticle> userArticleList)throws ServiceException, ServiceDaoException{
		
		return userArticleService.updateList(userArticleList);
		          
		
		}	
		  
    	   
		@Override
		public UserArticle getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return userArticleService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<UserArticle> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return userArticleService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getUserArticleIdByArticleIDAndUserID(Long articleID,Long userID)throws ServiceException, ServiceDaoException{
		
		return userArticleService.getUserArticleIdByArticleIDAndUserID(articleID,userID);
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public List<Long>  getUserArticleIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException{
		
		return userArticleService.getUserArticleIdsByCollectionStatusAndUserID(collectionStatus,userID,start,limit);
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public List<Long>  getUserArticleIdsByLikedStatusAndUserID(Integer likedStatus,Long userID,Integer start,Integer limit)throws ServiceException, ServiceDaoException{
		
		return userArticleService.getUserArticleIdsByLikedStatusAndUserID(likedStatus,userID,start,limit);
	
	
	}
	
		
	
	
    			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Integer  countUserArticleIdsByCollectionStatusAndUserID(Integer collectionStatus,Long userID)throws ServiceException, ServiceDaoException{
		
		return userArticleService.countUserArticleIdsByCollectionStatusAndUserID(collectionStatus,userID);
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Integer  countUserArticleIdsByLikedStatusAndUserID(Integer likedStatus,Long userID)throws ServiceException, ServiceDaoException{
		
		return userArticleService.countUserArticleIdsByLikedStatusAndUserID(likedStatus,userID);
	
	
	}
	
		
	
		@Override
	public List<Long> getUserArticleIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userArticleService.getUserArticleIds(start, limit);
	}

	@Override
	public Integer countUserArticleIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userArticleService.countUserArticleIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userArticleService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userArticleService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   userArticleService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.userArticleService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

