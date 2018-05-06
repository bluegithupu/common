/**
 * 
 */
package com.ptteng.sca.academy.tfboys.client;

import java.util.List;
import java.util.Map;

import com.ptteng.academy.tfboys.model.UserSign;
import com.ptteng.academy.tfboys.service.UserSignService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class UserSignSCAClient implements UserSignService {

    private UserSignService userSignService;

	public UserSignService getUserSignService() {
		return userSignService;
	}
	
	
	public void setUserSignService(UserSignService userSignService) {
		this.userSignService =userSignService;
	}
	
	
			   
		@Override
		public Long insert(UserSign userSign)throws ServiceException, ServiceDaoException{
		
		return userSignService.insert(userSign);
		          
		
		}	
		  
    	   
		@Override
		public List<UserSign> insertList(List<UserSign> userSignList)throws ServiceException, ServiceDaoException{
		
		return userSignService.insertList(userSignList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return userSignService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(UserSign userSign)throws ServiceException, ServiceDaoException{
		
		return userSignService.update(userSign);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<UserSign> userSignList)throws ServiceException, ServiceDaoException{
		
		return userSignService.updateList(userSignList);
		          
		
		}	
		  
    	   
		@Override
		public UserSign getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return userSignService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<UserSign> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return userSignService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getUserSignIdByUserID(Long userID)throws ServiceException, ServiceDaoException{
		
		return userSignService.getUserSignIdByUserID(userID);
	
	
	}
	
		
	
	
    		
	
		@Override
	public List<Long> getUserSignIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userSignService.getUserSignIds(start, limit);
	}

	@Override
	public Integer countUserSignIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userSignService.countUserSignIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userSignService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userSignService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   userSignService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.userSignService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

