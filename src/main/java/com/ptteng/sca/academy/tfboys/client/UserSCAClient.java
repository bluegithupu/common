/**
 * 
 */
package com.ptteng.sca.academy.tfboys.client;

import java.util.List;
import java.util.Map;

import com.ptteng.academy.tfboys.model.User;
import com.ptteng.academy.tfboys.service.UserService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class UserSCAClient implements UserService {

    private UserService userService;

	public UserService getUserService() {
		return userService;
	}
	
	
	public void setUserService(UserService userService) {
		this.userService =userService;
	}
	
	
			   
		@Override
		public Long insert(User user)throws ServiceException, ServiceDaoException{
		
		return userService.insert(user);
		          
		
		}	
		  
    	   
		@Override
		public List<User> insertList(List<User> userList)throws ServiceException, ServiceDaoException{
		
		return userService.insertList(userList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return userService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(User user)throws ServiceException, ServiceDaoException{
		
		return userService.update(user);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<User> userList)throws ServiceException, ServiceDaoException{
		
		return userService.updateList(userList);
		          
		
		}	
		  
    	   
		@Override
		public User getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return userService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<User> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return userService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getUserIdByOpenID(String openID)throws ServiceException, ServiceDaoException{
		
		return userService.getUserIdByOpenID(openID);
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getUserIdByEmail(String email)throws ServiceException, ServiceDaoException{
		
		return userService.getUserIdByEmail(email);
	
	
	}
	
			
			
		/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	 @Override
	public Long  getUserIdByPhone(String phone)throws ServiceException, ServiceDaoException{
		
		return userService.getUserIdByPhone(phone);
	
	
	}
	
		
	
	
    		
	
		@Override
	public List<Long> getUserIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userService.getUserIds(start, limit);
	}

	@Override
	public Integer countUserIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userService.countUserIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return userService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   userService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.userService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

